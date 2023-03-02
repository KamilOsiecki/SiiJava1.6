package org.example;

public class Main {
    public static void main(String[] args){
        SensitiveKeyHandler.setDefaultValues();
        printProperties();
    }

    public static void printProperties(){

        PropertyHandler.getProperties().forEach((k, v) -> {
            if (SensitiveKeyHandler.isKeySensitive(k)) {
                System.out.println(k + ": *****");
            } else {
                System.out.println(k + ": " + v);
            }
        });
    }
}