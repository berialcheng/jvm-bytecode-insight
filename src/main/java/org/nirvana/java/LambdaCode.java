package org.nirvana.java;

import java.util.Arrays;

public class LambdaCode {

    static int clz_field = 1;

    public static void main(String[] args) {
        Arrays.asList( "a", "b", "c", "d")
            .forEach(e -> {
                clz_field++;
                System.out.println(e + clz_field);
            });

        Arrays.asList( "e", "f", "g", "h")
            .stream().map(String::toUpperCase);

        CustomAction<String> a = m -> m.toUpperCase();
        a.apply("t");
    }

    interface CustomAction<T> {
        void apply(T m);
    }
}

