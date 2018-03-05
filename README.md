JVM Bytecode Insight
---
![Progress](http://progressed.io/bar/40?title=Progress) ![](https://img.shields.io/github/release/berialcheng/jvm-bytecode-insight.svg)

The purpose of this project is mainly give us insight upon the secret of these magic languages built on JVM.

This project is not intent to be an detail bytecode specification, but to reval some of the differences while modern/emerging features implementation upon different JVM program lanaguages. If you dont have any knowledge over JVM class bytecode before, you better check [here](https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html). 

Prerequisite
---
* Maven 3
* JDK 1.8
* Groovy 2.4.8 (maven plugin compiler)
* Kotlin 1.3 (maven plugin compiler)

Get Started
---
1. `mvn clean package && cd target/classes`
2. Inspect the bytecode through `javap -v -p org.nirvana.xxx.XXXXXX`

Catalog
---
> Java
1. Java Generic [View](docs/java_generic.md)
2. Java Lambda [View](docs/java_lambda.md)

> Groovy
1. Groovy Closure [View](docs/groovy_closure.md)
2. Groovy Lambda [View](docs/groovy_lambda.md)
3. Groovy Metaclass [View](docs/groovy_meta.md)

> Kotlin
1. Kotlin Dataclass [View](docs/kotlin_dataclass.md)
2. Kotlin Function Default Values [View](docs/kotlin_fdv.md)
3. Kotlin NullSafety [View](docs/kotlin_nullsafety.md)
4. Kotlin Range [View](docs/kotlin_range.md)
5. Kotlin Singleton [View](docs/kotlin_singleton.md)
6. kotlin String Interpolation [View](docs/kotlin_st.md)
7. Kotlin TypeCheck [View](docs/kotlin_typecheck.md)
8. Kotlin Lambda [View](docs/kotlin_lambda.md)
9. Kotlin Coroutine [View](docs/kotlin_coroutine.md)

> Scala
1. Scala CaseClass [View](docs/scala_caseclass.md)
2. Scala High-Order Function [View](docs/scala_function.md)
3. Scala Singleton [View](docs/scala_singleton.md)
4. Scala Trait [View](docs/scala_trait.md)
5. Scala Tuple [View](docs/scala_tuple.md)

### References
* https://docs.oracle.com/javase/8/docs/technotes/guides/vm/multiple-language-support.html
* https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html
* http://groovy-lang.org/metaprogramming.html
* http://groovy-lang.org/closures.html#_delegation_strategy