/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto_WebPatrones;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Lamec
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("jeferson")
                .password("{noop}123")
                .roles("ADMIN","VENDEDOR","USER")
                .and()
                .withUser("anthony")
                .password("{noop}456")
                .roles("ADMIN","VENDEDOR","USER")
                .and()
                .withUser("pedro")
                .password("{noop}789")
                .roles("USER");
    }
    
    //El siguiente metodo realiza la autorizacion a recursos del sitio web
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/noticias_internacionales/nuevo","/noticias_internacionales/guardar",
                        "/noticias_internacionales/modificar/**","/noticias_internacionales/eliminar/**",
                        "/noticias_nacionales/nuevo","/noticias_nacionales/guardar",
                        "/noticias_nacionales/modificar/**","/noticias_nacionales/eliminar/**",
                        "/usuario/nuevo","usuario/guardar",
                        "/usuario/modificar/**","usuario/eliminar/**")
                .hasRole("ADMIN")
                .antMatchers("/noticias_internacionales/listado",
                        "/noticias_nacionales/listado/**")
                .hasAnyRole("ADMIN","VENDEDOR","USER")
                .antMatchers("/")
                .hasAnyRole("ADMIN","VENDEDOR","USER")
                .and().formLogin().loginPage("/login")
                .and().exceptionHandling().accessDeniedPage("/errores/403");
                
    }    
}
