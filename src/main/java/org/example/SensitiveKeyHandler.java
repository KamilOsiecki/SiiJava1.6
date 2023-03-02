package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SensitiveKeyHandler {

    private static ArrayList<String> keys = new ArrayList<>();

    public static void addKey(String key) {
        keys.add(key);
    }

    public static void removeKey(String key) {
        keys.remove(key);
    }

    public static void setDefaultValues() {
        keys.addAll(Arrays.asList("login", "password", "url"));
    }

    public static boolean isKeySensitive(String k) {
        return Arrays.asList(keys.toArray()).contains(k);
    }
}