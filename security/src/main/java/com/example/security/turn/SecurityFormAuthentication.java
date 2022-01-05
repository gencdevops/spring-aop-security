package com.example.security.turn;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityFormAuthentication extends WebSecurityConfigurerAdapter {

   //Buradaki yapi security enable ettigimizde direkt default olarak geliyor
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // tum requestler authorize olacak
                .anyRequest() // post get vs her turlu request
                .authenticated()
                .and()// and sonunda tekrar Httpsecurity donuyor
                .formLogin() // jsp gibi home sayfasi olan uygulamalarda kullanilir tomcat sagliyor
                .and()
                .httpBasic(); // security sayfasi yerine browserdan kullanici adi sifre ekrani geliyor rest tarzi clientlarda kullaniliyor

    }
}
