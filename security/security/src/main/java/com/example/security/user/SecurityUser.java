package com.example.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@EnableWebSecurity
public class SecurityUser extends WebSecurityConfigurerAdapter {
//tum sayfalara authentication istiyor
    @Autowired
    void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication() //bellektte in memory authentication
                .withUser("taner")
                //.password("taner") bu haliyle db ye otomatik encode edip sakliyor
                .password("{noop}taner") // {noop} yazarsak encode etmiyor
                .roles("USER"); // role veriyoruz
    }
}
