package com.example.project1.Configuration;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(@NotNull HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/signup").permitAll() // Allow access to the signup page without authentication
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login") // Specify the URL of your custom login page
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    // Add your authentication configuration here if necessary
}
