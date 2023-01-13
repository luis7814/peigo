package com.peigo.account.security;

import org.apache.commons.logging.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Set;

import static org.mockito.Mockito.*;

class JWTAuthenticationFilterTest {
    @Mock
    ApplicationEventPublisher eventPublisher;
    @Mock
    AuthenticationDetailsSource<HttpServletRequest, ?> authenticationDetailsSource;
    @Mock
    AuthenticationManager authenticationManager;
    @Mock
    MessageSourceAccessor messages;
    @Mock
    RememberMeServices rememberMeServices;
    @Mock
    RequestMatcher requiresAuthenticationRequestMatcher;
    @Mock
    SessionAuthenticationStrategy sessionStrategy;
    @Mock
    AuthenticationSuccessHandler successHandler;
    @Mock
    AuthenticationFailureHandler failureHandler;
    @Mock
    SecurityContextRepository securityContextRepository;
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
    JWTAuthenticationFilter jWTAuthenticationFilter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAttempAuthentication() {
        Authentication result = jWTAuthenticationFilter.attempAuthentication(null, null);
        Assertions.assertEquals(null, result);
    }

    @Test
    void testSuccessfulAuthentication() throws ServletException, IOException {
        jWTAuthenticationFilter.successfulAuthentication(null, null, null, null);
    }
}

