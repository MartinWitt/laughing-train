

FROM curlimages/curl AS downloader
ARG RUN_JAVA_VERSION=1.3.8
RUN curl https://repo1.maven.org/maven2/io/fabric8/run-java-sh/${RUN_JAVA_VERSION}/run-java-sh-${RUN_JAVA_VERSION}-sh.sh -o /tmp/run-java.sh


# FROM eclipse-temurin:11-jdk-alpine
FROM eclipse-temurin:19-jdk-alpine

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'
RUN mkdir /deployments \
  && chown 1001 /deployments \
  && chmod "g+rwX" /deployments \
  && chown 1001:root /deployments

COPY --from=downloader /tmp/run-java.sh /deployments/run-java.sh

RUN chown 1001 /deployments/run-java.sh \
  && chmod 540 /deployments/run-java.sh

# Configure the JAVA_OPTIONS, you can add -XshowSettings:vm to also display the heap size.
ENV GC_CONTAINER_OPTIONS="-XX:+UseZGC"
ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager --enable-preview"
ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"
# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=185 build/quarkus-app/lib/ /deployments/lib/
COPY --chown=185 build/quarkus-app/*.jar /deployments/
COPY --chown=185 build/quarkus-app/app/ /deployments/app/
COPY --chown=185 build/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 8080
USER 185

ENTRYPOINT [ "/deployments/run-java.sh" ]