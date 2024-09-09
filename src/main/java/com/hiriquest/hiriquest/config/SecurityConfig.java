package com.hiriquest.hiriquest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Deshabilitar CSRF de esta manera en Spring Security 6.x
            .authorizeHttpRequests(auth -> auth
                // .requestMatchers("/api/misiones/**").permitAll() // Usar requestMatchers en lugar de antMatchers
                .anyRequest().permitAll() // Proteger cualquier otra ruta
            );
             // Configurar autenticación básica si es necesaria

        return http.build();
    }
}

