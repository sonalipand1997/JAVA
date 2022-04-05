package com.cybage.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
@Override
public void configure(AuthenticationManagerBuilder auth) throws Exception
{
auth.inMemoryAuthentication().withUser("Jhon").password("Jhon123").roles("USER")
.and().withUser("admin").password("admin").roles("ADMIN");
}

@Bean
public PasswordEncoder getPasswordEncoder()
{
return NoOpPasswordEncoder.getInstance();
}


/*
@Bean
public PasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
}

*/

@Override
protected void configure(HttpSecurity http) throws Exception {


//HTTP Basic authentication
http.httpBasic()
.and()
.authorizeRequests()
.antMatchers(HttpMethod.GET, "/getAll").hasRole("USER")
.antMatchers(HttpMethod.POST, "/addEmployee").hasRole("ADMIN")
// .antMatchers(HttpMethod.PUT, "/books/**").hasRole("ADMIN")
// .antMatchers(HttpMethod.PATCH, "/books/**").hasRole("ADMIN")
// .antMatchers(HttpMethod.DELETE, "/books/**").hasRole("ADMIN")
.and()
.csrf().disable()
.formLogin().disable();
}


}