package com.peigo.account.security;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.env.Environment;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Set;

import static org.mockito.Mockito.*;

class JWTAuthorizationFilterTest {
    @Mock
    Log logger;
    @Mock
    Environment environment;
    @Mock
    ServletContext servletContext;
    @Mock
    FilterConfig filterConfig;
    @Mock
    Set<String> requiredProperties;
    @InjectMocks
    JWTAuthorizationFilter jWTAuthorizationFilter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testDoFilterInternal() throws ServletException, IOException {
        jWTAuthorizationFilter.doFilterInternal(null, null, null);
    }
}

