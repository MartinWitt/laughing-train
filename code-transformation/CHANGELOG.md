# Change Log
The following bad smells are refactored:
## LambdaInsteadOfExecutableReference
Lambda is used instead of executable reference
- https://rules.sonarsource.com/java/RSPEC-1612
## ThreadLocalWithInitialValue
`ThreadLocal` with initialValue override shall be replaced by `ThreadLocal.withInitialValue`
- https://rules.sonarsource.com/java/RSPEC-4065

## The following has changed in the code:
### ThreadLocalWithInitialValue
- `ThreadLocal` with initialValue `new spoon.reflect.factory.FactoryImpl.Dedup()` was replaced by `ThreadLocal.withInitialValue(java.lang.ThreadLocal.withInitial(() -> new spoon.reflect.factory.FactoryImpl.Dedup()))`
- `ThreadLocal` with initialValue `new spoon.reflect.factory.FactoryImpl.Dedup()` was replaced by `ThreadLocal.withInitialValue(java.lang.ThreadLocal.withInitial(() -> new spoon.reflect.factory.FactoryImpl.Dedup()))`
### LambdaInsteadOfExecutableReference
- Replaced lambda `() -> new spoon.reflect.factory.FactoryImpl.Dedup()` with executable ref `spoon.reflect.factory.FactoryImpl.Dedup::new`
- Replaced lambda `() -> new spoon.reflect.factory.FactoryImpl.Dedup()` with executable ref `spoon.reflect.factory.FactoryImpl.Dedup::new`
