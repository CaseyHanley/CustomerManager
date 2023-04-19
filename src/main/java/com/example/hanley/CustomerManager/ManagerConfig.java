package com.example.hanley.CustomerManager;


import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableJpaRepositories
@EntityScan
public class ManagerConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.authorizeHttpRequests(configurer->
                configurer
                        .requestMatchers(HttpMethod.GET,"/**").hasAnyRole("MANAGER","ADMIN","USER")
                        .requestMatchers(HttpMethod.GET,"/customers").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE,"/customer/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST,"/customer/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT,"/customer/**").hasRole("MANAGER")
        );

        http.httpBasic();
        http.csrf().disable();
//        http.cors().disable();

        return http.build();
    }


    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails manager = User.builder()
                .username("Manager")
                .password("{noop}GenSpark2023")
                .roles("USER","MANAGER")
                .build();

        UserDetails admin = User.builder()
                .username("Admin")
                .password("{noop}GenSpark2000")
                .roles("USER","MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(manager,admin);

    }

}
