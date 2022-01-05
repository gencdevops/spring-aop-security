package com.example.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
public class SecurityCustomEncoder extends WebSecurityConfigurerAdapter {

//    @Autowired
//    void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth
//                .inMemoryAuthentication() //bellektte in memory authentication
//                .withUser("taner")
//                //.password("taner") bu haliyle db ye otomatik encode edip sakliyor
//                //.password("{noop}taner") // {noop} yazarsak encode etmiyor
//                .password(passwordEncoder().encode("taner")) // parola artik varsayilana gore encode edilerek dolasacak
//                .roles("USER"); // role veriyoruz
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

}
