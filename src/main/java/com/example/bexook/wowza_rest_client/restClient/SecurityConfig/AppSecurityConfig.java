package com.example.bexook.wowza_rest_client.restClient.SecurityConfig;

import com.example.bexook.wowza_rest_client.restClient.UserRepositorySecurity.UserDBConnection.ApplicationUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ApplicationUserDetailsService applicationUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/login","/register_user")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }



    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(applicationUserDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder.getPasswordEncoder());
        return daoAuthenticationProvider;
    }
}
