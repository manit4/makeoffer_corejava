package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.helper.JWTAuthenticationFilter;
import com.example.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalAuthentication
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	CustomUserDetailsService detailsService;
	
	@Autowired
	JWTAuthenticationFilter authenticationFilter;

	
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		System.out.println("inside first configure()");
//	
//		http.csrf().disable().cors().disable()
//			.authorizeHttpRequests()
//				.antMatchers("/all/public", "/token").permitAll()
//				.antMatchers("/all/admin").hasRole("Admin")
//				.antMatchers("/all/registered").hasRole("Employee")
//					.anyRequest()
//						.authenticated()
//							.and()
//								.httpBasic();
//	}
	
	
protected void configure(HttpSecurity http) throws Exception {
		
		System.out.println("inside first configure()");
	
		http.csrf().disable().cors().disable()
			.authorizeHttpRequests()
				.antMatchers("/all/public", "/token").permitAll()
				.antMatchers("/all/admin").hasRole("Admin")
				.antMatchers("/all/registered").hasRole("Employee")
					.anyRequest()
						.authenticated()
							.and()
							.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);
	}
	
	
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		System.out.println("inside first configure()");
//	
//		http
//			.authorizeHttpRequests()
////				.antMatchers("/all/public", "/all/registered", "/all/admin").permitAll()
//				.antMatchers("/all/**").permitAll()
//					.anyRequest()
//						.authenticated()
//							.and()
//								.httpBasic();
//	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

//		System.out.println("inside second configure()");
//		
//		String encodedMan = encoder().encode("12");
//		String encodedMani = encoder().encode("23");
//
//		auth.inMemoryAuthentication().withUser("man").password(encodedMan).roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("mani").password(encodedMani).roles("EMPLOYEE");
		
		System.out.println("inside second configure()....");
		
		auth.userDetailsService(detailsService);

	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManager() throws Exception {
		
		return super.authenticationManager();
	}
	
	

}
