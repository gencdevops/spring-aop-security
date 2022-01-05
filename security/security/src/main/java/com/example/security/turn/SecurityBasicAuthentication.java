package com.example.security.turn;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//@EnableWebSecurity
public class SecurityBasicAuthentication extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // tum requestler authorize olacak
                .anyRequest() // post get vs her turlu request
                .authenticated()
                .and()// and sonunda tekrar Httpsecurity donuyor
         .httpBasic(); // security sayfasi yerine browserdan kullanici adi sifre ekrani geliyor rest tarzi clientlarda kullaniliyor

    }
}
