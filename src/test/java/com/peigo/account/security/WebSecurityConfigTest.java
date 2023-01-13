package com.peigo.account.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.mockito.Mockito.*;

class WebSecurityConfigTest {
    @Mock
    UserDetailsService userDetailsService;
    @Mock
    JWTAuthorizationFilter jwtAuthorizationFilter;
    @InjectMocks
    WebSecurityConfig webSecurityConfig;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFilterChain() throws Exception {
        SecurityFilterChain result = webSecurityConfig.filterChain(null, null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAuthenticationManager() throws Exception {
        AuthenticationManager result = webSecurityConfig.authenticationManager(null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void testPasswordEncoder() {
        PasswordEncoder result = webSecurityConfig.passwordEncoder();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testMain() {
        WebSecurityConfig.main(new String[]{"args"});
    }
}

