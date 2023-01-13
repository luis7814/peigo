package com.peigo.account.security;

import com.peigo.account.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.*;

class UserDetailsImplTest {
    @Mock
    User user;
    @InjectMocks
    UserDetailsImpl userDetailsImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAuthorities() {
        Collection<? extends GrantedAuthority> result = userDetailsImpl.getAuthorities();
        Assertions.assertEquals(List.of(null), result);
    }

    @Test
    void testGetPassword() {
        when(user.getPassword()).thenReturn("getPasswordResponse");

        String result = userDetailsImpl.getPassword();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testGetUsername() {
        when(user.getName()).thenReturn("getNameResponse");

        String result = userDetailsImpl.getUsername();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testIsAccountNonExpired() {
        boolean result = userDetailsImpl.isAccountNonExpired();
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsAccountNonLocked() {
        boolean result = userDetailsImpl.isAccountNonLocked();
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsCredentialsNonExpired() {
        boolean result = userDetailsImpl.isCredentialsNonExpired();
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsEnabled() {
        boolean result = userDetailsImpl.isEnabled();
        Assertions.assertEquals(true, result);
    }

    @Test
    void testGetName() {
        when(user.getName()).thenReturn("getNameResponse");

        String result = userDetailsImpl.getName();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

