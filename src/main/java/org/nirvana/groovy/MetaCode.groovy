package org.nirvana.groovy

class MetaCode {

    String name
    String sayHello( toWhom ){ "Hello $toWhom" }

    def main(){
        MetaCode.metaClass.invokeMethod = { String name, args ->
            "$name() called with $args"
        }
    }
}