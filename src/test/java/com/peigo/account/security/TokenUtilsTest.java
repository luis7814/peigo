package com.peigo.account.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

class TokenUtilsTest {

    @Test
    void testCreateToken() {
        String result = TokenUtils.createToken("name", "email");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testAuthenticationToken() {
        UsernamePasswordAuthenticationToken result = TokenUtils.authenticationToken("token");
        Assertions.assertEquals(null, result);
    }
}

