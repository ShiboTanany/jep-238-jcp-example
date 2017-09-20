package com.igormaznitsa.tests;

public class Main {
    public static void main(final String... args) {
        //#if java.version>=9
        //$ System.out.println("Hello Java9! "+Runtime.Version.parse("1.2.3").toString());
        //#else
        System.out.println("Hello Old-Java!");
        //#endif
        Class<?> java9Class = null;
        try {
            java9Class = Class.forName("com.igormaznitsa.tests.OnlyJava9Class");
        } catch (Exception ex) {
        }
        System.out.println("OnlyJava9Class is " + (java9Class == null ? "invisible" : "visible"));
    }
}