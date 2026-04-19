package com.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Temporary security configuration for Phase 1.
 *
 * We permit all requests so we can develop and test our API without authentication.
 * In Phase 5 we will replace this with JWT-based security and role enforcement.
 *
 * Why a @Bean SecurityFilterChain instead of extending WebSecurityConfigurerAdapter?
 * WebSecurityConfigurerAdapter was deprecated in Spring Security 5.7 and removed in 6.x.
 * The modern approach is to declare a SecurityFilterChain bean — it's more composable
 * and easier to test.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Disable CSRF — not needed for a stateless REST API.
            // CSRF protection is for browser-based apps with session cookies.
            .csrf(AbstractHttpConfigurer::disable)
            // Allow all requests without authentication — TEMPORARY, Phase 1 only.
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            // Allow the H2 console (which renders in an iframe) to load properly.
            // H2 console uses frames; Spring Security blocks frames by default.
            .headers(headers -> headers
                .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));

        return http.build();
    }
}
