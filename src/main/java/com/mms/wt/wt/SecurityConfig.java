package com.mms.wt.wt;

import com.mms.wt.wt.models.UserDetailSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    UserDetailSerivce userdetailservice;

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.authorizeRequests()
                .antMatchers("/api/article/admin")

                .hasRole("ADMIN")
                .antMatchers("/")
                .permitAll()
                .and()
                .formLogin();
                                    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userdetailservice);



    }
    @Bean

    public PasswordEncoder getPasswordEncoder (){ return NoOpPasswordEncoder.getInstance();

    }
}
