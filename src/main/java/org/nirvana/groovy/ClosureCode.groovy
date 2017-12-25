package org.nirvana.groovy

class ClosureCode {

    def main(){
        def closureWithOneArg = { str -> str.toUpperCase() }
        assert closureWithOneArg('groovy') == 'GROOVY'
    }
}