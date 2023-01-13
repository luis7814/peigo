package com.peigo.account.utilities;

import java.util.UUID;

public class Utilities {

    public static String generatorId() {
        return String.valueOf(System.currentTimeMillis()) +
                String.valueOf(UUID.randomUUID()).replace("-", "");
    }
}
