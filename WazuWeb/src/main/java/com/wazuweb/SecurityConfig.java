package com.wazuweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.wazuweb.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Autowired	
	private BCryptPasswordEncoder bcrypt;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder ();
		return bCryptPasswordEncoder;
		}
	/*
	@Override
	protected void configure (AuthenticationManagerBuilder auth)
	   throws Exception {
	       auth
	          .inMemoryAuthentication()
	          .withUser("user")
	             .password("password")
	             .roles("USER")
	             .and()
	          .withUser("admin")
	             .password("admin")
	             .roles("USER","ADMIN");
	          
		auth.userDetailsService(userDetailsService).passwordEncoder(bcrypt);
		
	      
		
	   }*/
	
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http
		   .authorizeRequests()
		   	   .antMatchers("/","/home","/registro").permitAll()
		   	   .antMatchers("/js").permitAll()
		   	   .antMatchers("/CSS").permitAll()
		   	   .antMatchers("/jugar").authenticated()
               //.anyRequest().authenticated()
		       .and()
		   .formLogin()
		       .loginPage("/login")
		       .permitAll()
		       .and()
		   .logout()
		       .permitAll();
		       
		/*
		http
			.authorizeRequests()
		   .anyRequest()
		   .authenticated()
		   .and()
		   .httpBasic();*/
	}
}


