package com.peigo.account.security;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.io.IOException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    public Authentication attempAuthentication(HttpServletRequest httpServletRequest,
                                               HttpServletResponse httpServletResponse) throws AuthenticationException {

        AuthCredentials authCredentials = new AuthCredentials();

        try {

            authCredentials = new ObjectMapper().readValue(httpServletRequest.getReader(), AuthCredentials.class);
        }catch (IOException e) {

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                authCredentials.getName(),
                authCredentials.getPassword(),
                Collections.emptyList()
        );

        return getAuthenticationManager().authenticate(authenticationToken);

    }

    @Override
    protected void successfulAuthentication(HttpServletRequest httpServletRequest,
                                            HttpServletResponse httpServletResponse,
                                            FilterChain filterChain,
                                            Authentication authentication) throws IOException, ServletException, java.io.IOException {

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        String token = TokenUtils.createToken(userDetails.getName(), userDetails.getUsername());

        httpServletResponse.addHeader("Authorization", "Bearer" + token);
        httpServletResponse.getWriter().flush();

        super.successfulAuthentication(httpServletRequest, httpServletResponse, filterChain, authentication);

    }
}
