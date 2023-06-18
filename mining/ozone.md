# ozone 
 
# Bad smells
I found 209 bad smells with 209 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 209 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/test/java/org/apache/hadoop/hdds/scm/container/TestReplicationManagerReport.java`
#### Snippet
```java
LifeCycleState.CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/test/java/org/apache/hadoop/hdds/scm/container/TestReplicationManagerReport.java`
#### Snippet
```java
HddsProtos.LifeCycleState.CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/test/java/org/apache/hadoop/hdds/scm/container/TestReplicationManagerReport.java`
#### Snippet
```java
LifeCycleState.CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/test/java/org/apache/hadoop/hdds/scm/container/TestReplicationManagerReport.java`
#### Snippet
```java
HddsProtos.LifeCycleState.CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/ha/HASecurityUtils.java`
#### Snippet
```java
subSCMCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/ha/SCMRatisServerImpl.java`
#### Snippet
```java
RaftPeerRole.LEADER.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/ha/SCMRatisServerImpl.java`
#### Snippet
```java
RaftPeerRole.FOLLOWER.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/ha/SCMRatisServerImpl.java`
#### Snippet
```java
peer.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/scm/protocolPB/OzonePBHelper.java`
#### Snippet
```java
k.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/update/server/SCMCRLUpdateHandler.java`
#### Snippet
```java
updateStatusRequest.getPendingCrlIdsList().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/SCMContainerMetrics.java`
#### Snippet
```java
OPEN.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/SCMContainerMetrics.java`
#### Snippet
```java
CLOSING.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/SCMContainerMetrics.java`
#### Snippet
```java
QUASI_CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/SCMContainerMetrics.java`
#### Snippet
```java
CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/SCMContainerMetrics.java`
#### Snippet
```java
DELETING.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/SCMContainerMetrics.java`
#### Snippet
```java
DELETED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/StorageContainerManager.java`
#### Snippet
```java
getScmCertificateServer().getCACertificate().getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/main/java/org/apache/hadoop/hdds/scm/server/StorageContainerManager.java`
#### Snippet
```java
entry.getValue().getLeft().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.OPEN.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.CLOSING.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.QUASI_CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.DELETING.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.DELETED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/server-scm/src/test/java/org/apache/hadoop/hdds/scm/server/TestSCMContainerMetrics.java`
#### Snippet
```java
LifeCycleState.RECOVERING.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/tools/src/main/java/org/apache/hadoop/hdds/scm/cli/TopologySubcommand.java`
#### Snippet
```java
info.getNodeOperationalStates(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/tools/src/main/java/org/apache/hadoop/hdds/scm/cli/TopologySubcommand.java`
#### Snippet
```java
info.getNodeStates(0).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/conf/HddsConfServlet.java`
#### Snippet
```java
gson.toJsonTree(propMap).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/hdds/ratis/ContainerCommandRequestMessage.java`
#### Snippet
```java
groupId.getUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/test/java/org/apache/hadoop/hdds/security/x509/certificate/utils/TestCertificateSignRequest.java`
#### Snippet
```java
csr.getSubject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/test/java/org/apache/hadoop/hdds/security/x509/certificate/utils/TestCertificateSignRequest.java`
#### Snippet
```java
csr.getSubject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/test/java/org/apache/hadoop/hdds/security/x509/certificate/utils/TestCertificateSignRequest.java`
#### Snippet
```java
csr.getSubject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/test/java/org/apache/hadoop/hdds/security/x509/certificate/utils/TestCertificateSignRequest.java`
#### Snippet
```java
((DERTaggedObject) (o)).getObject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/test/java/org/apache/hadoop/hdds/security/x509/certificate/utils/TestRootCertificate.java`
#### Snippet
```java
certificateHolder.getIssuer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/test/java/org/apache/hadoop/hdds/security/x509/certificate/utils/TestRootCertificate.java`
#### Snippet
```java
certificateHolder.getSubject().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/security/x509/certificate/authority/DefaultApprover.java`
#### Snippet
```java
x500Name.getRDNs(BCStyle.OU)[0].getFirst().getValue().toASN1Primitive().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/security/x509/certificate/authority/DefaultApprover.java`
#### Snippet
```java
x500Name.getRDNs(BCStyle.O)[0].getFirst().getValue().toASN1Primitive().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/security/x509/certificate/authority/DefaultApprover.java`
#### Snippet
```java
x500Name.getRDNs(BCStyle.CN)[0].getFirst().getValue().toASN1Primitive().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/security/x509/certificate/authority/profile/DefaultProfile.java`
#### Snippet
```java
GeneralNames.getInstance(ext.getParsedValue()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/security/x509/certificate/authority/profile/DefaultProfile.java`
#### Snippet
```java
name.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/security/x509/certificate/authority/profile/DefaultProfile.java`
#### Snippet
```java
name.getName().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/server/http/BaseHttpServer.java`
#### Snippet
```java
httpServer.getWebAppContext().getAttribute(JETTY_BASETMPDIR).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/server/http/HttpServer2.java`
#### Snippet
```java
rawRequest.getRequestURL().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/framework/src/main/java/org/apache/hadoop/hdds/server/http/PrometheusMetricsSink.java`
#### Snippet
```java
metric.type().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/test/java/org/apache/hadoop/ozone/TestHddsSecureDatanodeInit.java`
#### Snippet
```java
certHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/test/java/org/apache/hadoop/ozone/TestHddsSecureDatanodeInit.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/test/java/org/apache/hadoop/ozone/TestHddsSecureDatanodeInit.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/test/java/org/apache/hadoop/ozone/TestHddsSecureDatanodeInit.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/test/java/org/apache/hadoop/ozone/TestHddsSecureDatanodeInit.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestDelegationToken.java`
#### Snippet
```java
folder.newFolder().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestDelegationToken.java`
#### Snippet
```java
token.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestDelegationToken.java`
#### Snippet
```java
token.getService().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
folder.newFolder().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
folder.newFolder().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
ClientId.randomId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
ClientId.randomId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
token.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
token.getService().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
certHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
certHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
newCertHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
certHolder.getSerialNumber().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
token1.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
token1.getService().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
cn.getFirst().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/TestSecureOzoneCluster.java`
#### Snippet
```java
cn.getFirst().getValue().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
msg.getCreateContainer().getContainerType().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockData.getFromProtoBuf(msg.getPutBlock().getBlockData()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getGetBlock().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getDeleteBlock().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getReadChunk().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getDeleteChunk().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getWriteChunk().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getListChunk().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockData.getFromProtoBuf(msg.getPutSmallFile().getBlock().getBlockData()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getGetSmallFile().getBlock().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/common/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerCommandRequestPBHelper.java`
#### Snippet
```java
BlockID.getFromProtobuf(msg.getGetCommittedBlockLength().getBlockID()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/main/java/org/apache/hadoop/ozone/container/common/helpers/ContainerUtils.java`
#### Snippet
```java
Paths.get(containerFile.getParent()).resolve(removeExtension(containerFile.getName())).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/main/java/org/apache/hadoop/ozone/container/common/impl/ContainerDataYaml.java`
#### Snippet
```java
constructScalar(((ScalarNode) (node))).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/main/java/org/apache/hadoop/ozone/container/common/states/endpoint/HeartbeatEndpointTask.java`
#### Snippet
```java
DeletedContainerBlocksSummary.getFrom(deleteBlocksCommand.blocksTobeDeleted()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/main/java/org/apache/hadoop/ozone/container/common/transport/server/ratis/CSMMetrics.java`
#### Snippet
```java
ContainerProtos.Type.forNumber(i + 1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-hdds/container-service/src/main/java/org/apache/hadoop/ozone/container/common/transport/server/ratis/ContainerStateMachine.java`
#### Snippet
```java
id.getUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/container/server/TestSecureContainerServer.java`
#### Snippet
```java
Paths.get(TEST_DIR, "dfs", "data", "hdds", RandomStringUtils.randomAlphabetic(4)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/main/java/org/apache/hadoop/ozone/protocolPB/OMPBHelper.java`
#### Snippet
```java
tok.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/main/java/org/apache/hadoop/ozone/protocolPB/OMPBHelper.java`
#### Snippet
```java
tok.getService().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/scm/TestSCMMXBean.java`
#### Snippet
```java
LifeCycleState.CLOSING.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/scm/TestSCMMXBean.java`
#### Snippet
```java
LifeCycleState.CLOSED.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/om/TestAddRemoveOzoneManager.java`
#### Snippet
```java
newOMRatisServer.getRaftGroupId().getUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/om/TestOzoneManagerConfiguration.java`
#### Snippet
```java
raftPeer.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/om/TestOzoneManagerConfiguration.java`
#### Snippet
```java
peer.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/om/TestOzoneManagerConfiguration.java`
#### Snippet
```java
peer.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/om/TestOzoneManagerPrepare.java`
#### Snippet
```java
om.getOmRatisServer().getServer().getGroupIds().iterator().next().getUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/om/TestSecureOzoneManager.java`
#### Snippet
```java
KERBEROS.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/OzoneManager.java`
#### Snippet
```java
RaftGroupId.valueOf(getRaftGroupIdFromOmServiceId(getOMServiceId())).getUuid().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/OzoneManager.java`
#### Snippet
```java
leaderId.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/OzoneManagerUtils.java`
#### Snippet
```java
token.getKind().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/OzoneManagerUtils.java`
#### Snippet
```java
token.getService().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/TrashPolicyOzone.java`
#### Snippet
```java
fs.makeQualified(path).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/TrashPolicyOzone.java`
#### Snippet
```java
trashRoot.getParent().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/TestOMMultiTenantManager.java`
#### Snippet
```java
AuthenticationMethod.KERBEROS.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/test/java/org/apache/hadoop/ozone/om/lock/TestOzoneManagerLock.java`
#### Snippet
```java
metricsCollector.getRecords().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/ratis/OzoneManagerRatisServer.java`
#### Snippet
```java
e.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/ratis/OzoneManagerRatisServer.java`
#### Snippet
```java
e.getId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/ratis/OzoneManagerStateMachine.java`
#### Snippet
```java
RaftPeerId.valueOf(raftPeerProto.getId()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/ratis/OzoneManagerStateMachine.java`
#### Snippet
```java
RaftPeerId.valueOf(roleInfoProto.getFollowerInfo().getLeaderInfo().getId().getId()).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/ratis/TestOzoneManagerStateMachine.java`
#### Snippet
```java
tempDir.newFolder().getAbsolutePath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/request/bucket/TestOMBucketCreateRequest.java`
#### Snippet
```java
resp.getOMResponse().getStatus().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/request/bucket/TestOMBucketCreateRequest.java`
#### Snippet
```java
resp.getOMResponse().getStatus().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/request/security/OMGetDelegationTokenRequest.java`
#### Snippet
```java
ozoneTokenIdentifier.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/request/security/OMRenewDelegationTokenRequest.java`
#### Snippet
```java
ozoneTokenIdentifier.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/om/request/security/OMRenewDelegationTokenRequest.java`
#### Snippet
```java
ozoneTokenIdentifier.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/request/security/TestOMGetDelegationTokenRequest.java`
#### Snippet
```java
identifier.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/request/security/TestOMGetDelegationTokenRequest.java`
#### Snippet
```java
modifiedRequest.getUpdateGetDelegationTokenRequest().getGetDelegationTokenResponse().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/request/security/TestOMGetDelegationTokenRequest.java`
#### Snippet
```java
modifiedRequest.getUpdateGetDelegationTokenRequest().getGetDelegationTokenResponse().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/test/java/org/apache/hadoop/ozone/om/response/security/TestOMGetDelegationTokenResponse.java`
#### Snippet
```java
identifier.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/main/java/org/apache/hadoop/ozone/security/OzoneDelegationTokenSelector.java`
#### Snippet
```java
token.getService().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/main/java/org/apache/hadoop/ozone/security/OzoneTokenIdentifier.java`
#### Snippet
```java
getOwner().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/main/java/org/apache/hadoop/ozone/security/OzoneTokenIdentifier.java`
#### Snippet
```java
getRealUser().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/common/src/main/java/org/apache/hadoop/ozone/security/OzoneTokenIdentifier.java`
#### Snippet
```java
getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/security/OzoneDelegationTokenSecretManager.java`
#### Snippet
```java
id.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/security/OzoneDelegationTokenSecretManager.java`
#### Snippet
```java
id.getRenewer().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozone-manager/src/main/java/org/apache/hadoop/ozone/security/OzoneDelegationTokenSecretManager.java`
#### Snippet
```java
identifier.getOwner().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/debug/TestLeaseRecoverer.java`
#### Snippet
```java
file.toUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/tools/src/main/java/org/apache/hadoop/ozone/debug/ChunkKeyHandler.java`
#### Snippet
```java
containerLayoutVersion.getChunkFile(new File(getChunkLocationPath(containerData.getContainerPath())), keyLocation.getBlockID(), ChunkInfo.getFromProtoBuf(chunkInfo)).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/freon/TestFreonWithDatanodeFastRestart.java`
#### Snippet
```java
snapshotInfo.getFile().getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/tools/src/main/java/org/apache/hadoop/ozone/freon/BaseFreonGenerator.java`
#### Snippet
```java
ClientId.randomId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/main/java/org/apache/hadoop/ozone/recon/ReconRestServletModule.java`
#### Snippet
```java
UriBuilder.fromPath("/api").path("v1").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/main/java/org/apache/hadoop/ozone/recon/ReconRestServletModule.java`
#### Snippet
```java
UriBuilder.fromResource(clss).build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/main/java/org/apache/hadoop/ozone/recon/ReconRestServletModule.java`
#### Snippet
```java
UriBuilder.fromPath(baseApiPath).path("*").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/main/java/org/apache/hadoop/ozone/recon/ReconRestServletModule.java`
#### Snippet
```java
UriBuilder.fromPath(basePath).path("*").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/main/java/org/apache/hadoop/ozone/recon/ReconRestServletModule.java`
#### Snippet
```java
UriBuilder.fromPath(basePath).path(path + "*").build().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/test/java/org/apache/hadoop/ozone/recon/persistence/AbstractReconSqlDBTest.java`
#### Snippet
```java
SQLDialect.DERBY.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/test/java/org/apache/hadoop/ozone/recon/persistence/TestReconWithDifferentSqlDBs.java`
#### Snippet
```java
SQLDialect.SQLITE.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon/src/main/java/org/apache/hadoop/ozone/recon/spi/impl/StorageContainerServiceProviderImpl.java`
#### Snippet
```java
RaftPeerRole.LEADER.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/shell/TestOzoneShellHA.java`
#### Snippet
```java
statusPathKey1.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/ozone/shell/TestOzoneShellHA.java`
#### Snippet
```java
statusPathKey2.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/s3gateway/src/main/java/org/apache/hadoop/ozone/s3/VirtualHostStyleFilter.java`
#### Snippet
```java
requestContext.getUriInfo().getRequestUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/s3gateway/src/main/java/org/apache/hadoop/ozone/s3/VirtualHostStyleFilter.java`
#### Snippet
```java
requestContext.getUriInfo().getRequestUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/s3gateway/src/test/java/org/apache/hadoop/ozone/s3/TestVirtualHostStyleFilter.java`
#### Snippet
```java
containerRequest.getRequestUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/s3gateway/src/test/java/org/apache/hadoop/ozone/s3/TestVirtualHostStyleFilter.java`
#### Snippet
```java
containerRequest.getRequestUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/tools/src/main/java/org/apache/hadoop/ozone/admin/nssummary/DiskUsageSubCommand.java`
#### Snippet
```java
subPathDU.get("path").toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/tools/src/main/java/org/apache/hadoop/ozone/admin/om/OMAdmin.java`
#### Snippet
```java
ClientId.randomId().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
TestOzoneFileSystem.TRASH_ROOT.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fileStatuses[0].getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
fs.getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
userTrash.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystem.java`
#### Snippet
```java
userTrash.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
fileStatus.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
fileStatus.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
fileStatus.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
fileStatus.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
status.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
status.getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestOzoneFileSystemWithFSO.java`
#### Snippet
```java
getFs().getUri().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestRootedOzoneFileSystem.java`
#### Snippet
```java
statuses.getLast().getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/integration-test/src/test/java/org/apache/hadoop/fs/ozone/TestRootedOzoneFileSystem.java`
#### Snippet
```java
fileStatusesLimit1[fileStatusesLimit1.length - 1].getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozonefs-common/src/main/java/org/apache/hadoop/fs/ozone/BasicOzoneFileSystem.java`
#### Snippet
```java
statuses.getLast().getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/ozonefs-common/src/main/java/org/apache/hadoop/fs/ozone/BasicOzoneFileSystem.java`
#### Snippet
```java
tmpStatusList.get(0).getPath().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-ozone-26022507090218744111972397332314179017/hadoop-ozone/recon-codegen/src/main/java/org/hadoop/ozone/recon/codegen/JooqCodeGenerator.java`
#### Snippet
```java
Paths.get(System.getProperty("java.io.tmpdir"), "recon-generated-schema-" + Time.monotonicNow()).toString()
```

