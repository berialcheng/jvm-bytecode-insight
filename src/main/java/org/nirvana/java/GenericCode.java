package org.nirvana.java;

public class GenericCode<T> {

    T instanceField;

    public GenericCode(T instanceField) {
        this.instanceField = instanceField;
    }

    public static void main(String[] args) {
        GenericCode<String> o = new GenericCode<>("Generic");
    }
}
