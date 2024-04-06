package org.techie.fms.airzbooking.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/flights/**").permitAll() // Allow access to public endpoints
                .anyRequest().authenticated() // Require authentication for all other endpoints
                .and()
                .formLogin() // Enable form-based login
                .loginPage("/login").permitAll() // Customize login page URL
                .and()
                .logout().permitAll(); // Allow anyone
    }
}
