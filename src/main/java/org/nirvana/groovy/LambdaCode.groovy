package org.nirvana.groovy



class LambdaCode {
    def main(){
        Runnable run = { println 'run' }
        list.each { println it } // or list.each(this.&println)
    }
}