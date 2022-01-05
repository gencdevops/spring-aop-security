package com.example.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;


//@EnableWebSecurity
public class SecurityPasswordEncoder extends WebSecurityConfigurerAdapter {
    @Autowired
    void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();


        auth
                .inMemoryAuthentication() //bellektte in memory authentication
                .withUser("taner")
                //.password("taner") bu haliyle db ye otomatik encode edip sakliyor
                //.password("{noop}taner") // {noop} yazarsak encode etmiyor
                .password(encoder.encode("taner")) // parola artik varsayilana gore encode edilerek dolasacak
                .roles("USER"); // role veriyoruz
    }
}
