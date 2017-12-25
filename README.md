JVM Class Insight
---
The purpose of this project is mainly give us insight upon the secret of these magic languages built on JVM.

Prerequisite
---
* Maven 3
* JDK 1.8
* Groovy 2.4.8 (maven plugin compiler)
* Kotlin 1.3 (maven plugin compiler)

Get Started
---
1. `mvn clean install`
2. `cd target/classes`
3. `javap -v -p org.nirvana....`

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

### References
*. https://docs.oracle.com/javase/8/docs/technotes/guides/vm/multiple-language-support.html
*. https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html
*. http://groovy-lang.org/metaprogramming.html
*. http://groovy-lang.org/closures.html#_delegation_strategy