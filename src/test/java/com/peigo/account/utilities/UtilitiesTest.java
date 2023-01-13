package com.peigo.account.utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilitiesTest {

    @Test
    void testGeneratorId() {
        String result = Utilities.generatorId();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

