/*
 * (c) Copyright 2021 Palantir Technologies Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.witchcraft.java.logging.format;

import com.palantir.witchcraft.api.logging.AuditLogV2;
import com.palantir.witchcraft.api.logging.DiagnosticLogV1;
import com.palantir.witchcraft.api.logging.EventLogV2;
import com.palantir.witchcraft.api.logging.MetricLogV1;
import com.palantir.witchcraft.api.logging.RequestLogV2;
import com.palantir.witchcraft.api.logging.ServiceLogV1;
import com.palantir.witchcraft.api.logging.TraceLogV1;
import java.util.Optional;
import java.util.function.BiFunction;

final class CombineWithLogVisitor<T, U, R> implements LogVisitor<R> {
    private final LogVisitor<T> first;
    private final LogVisitor<U> second;
    private final BiFunction<T, U, R> combiner;

    CombineWithLogVisitor(LogVisitor<T> first, LogVisitor<U> second, BiFunction<T, U, R> combiner) {
        this.first = first;
        this.second = second;
        this.combiner = combiner;
    }

    @Override
    public Optional<R> serviceV1(ServiceLogV1 serviceLogV1) {
        return combineWith(serviceLogV1, LogVisitor::serviceV1);
    }

    @Override
    public Optional<R> requestV2(RequestLogV2 requestLogV2) {
        return combineWith(requestLogV2, LogVisitor::requestV2);
    }

    @Override
    public Optional<R> eventV2(EventLogV2 eventLogV2) {
        return combineWith(eventLogV2, LogVisitor::eventV2);
    }

    @Override
    public Optional<R> metricV1(MetricLogV1 metricLogV1) {
        return combineWith(metricLogV1, LogVisitor::metricV1);
    }

    @Override
    public Optional<R> traceV1(TraceLogV1 traceLogV1) {
        return combineWith(traceLogV1, LogVisitor::traceV1);
    }

    @Override
    public Optional<R> auditV2(AuditLogV2 auditLogV2) {
        return combineWith(auditLogV2, LogVisitor::auditV2);
    }

    @Override
    public Optional<R> diagnosticV1(DiagnosticLogV1 diagnosticLogV1) {
        return combineWith(diagnosticLogV1, LogVisitor::diagnosticV1);
    }

    private <L> Optional<R> combineWith(L log, LogFunctionSelector<L> logFunc) {
        return logFunc.apply(first, log).flatMap(t -> {
            return logFunc.apply(second, log).map(u -> combiner.apply(t, u));
        });
    }

    private interface LogFunctionSelector<L> {
        <X> Optional<X> apply(LogVisitor<X> logVisitor, L logLine);
    }
}