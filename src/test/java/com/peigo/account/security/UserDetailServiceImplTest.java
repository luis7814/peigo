package com.peigo.account.security;

import com.peigo.account.model.User;
import com.peigo.account.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import static org.mockito.Mockito.*;

class UserDetailServiceImplTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserDetailServiceImpl userDetailServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoadUserByUsername() {
        when(userRepository.findOneByName(anyString())).thenReturn(new User());

        UserDetails result = userDetailServiceImpl.loadUserByUsername("username");
        Assertions.assertEquals(new UserDetailsImpl(new User()), result);
    }
}

