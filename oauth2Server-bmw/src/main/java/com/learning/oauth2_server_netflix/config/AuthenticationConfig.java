package com.learning.oauth2_server_netflix.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class AuthenticationConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception{
        return configuration.getAuthenticationManager();
    }

    @Bean
    public UserDetailsService defaultTableUserDetailService(){
        return new JdbcUserDetailsManager(dataSource);
    }


    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService defaultTableUserDetailService) {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(defaultTableUserDetailService);

        provider.setPasswordEncoder(new BCryptPasswordEncoder());

        return provider;

    }
}
