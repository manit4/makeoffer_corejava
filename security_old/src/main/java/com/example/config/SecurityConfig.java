package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	CustomUserDetailsService detailsService;
	
	
	protected void configure(HttpSecurity http) throws Exception {
		
		System.out.println("insdie first configure()");
		
		http
			.authorizeHttpRequests()
				.antMatchers("/getMsg").hasRole("Admin")
					.anyRequest()
						.authenticated()
							.and()
								.httpBasic();
	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		System.out.println("inside second configure()");
		
//		auth.inMemoryAuthentication().withUser("man").password("12").roles("Admin");
//		auth.inMemoryAuthentication().withUser("mani").password("23").roles("Employee");
		
		//auth.userDetailsService(detailsService);
		
		auth.userDetailsService(detailsService);
		
	}
	
//	@Bean
//	public PasswordEncoder encoder() {
//		System.out.println("insdie noOpPasswordEncoder...");
//		
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("inside BcryptPasswordEncoder Bean....");
		
		return new BCryptPasswordEncoder();
	}
	
	
	
	
	
	
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		System.out.println("inside configurer...1");
//
//		String suhailPasswordEncoded = this.passwordEncoder().encode("Ali");
//		System.out.println("suhailPasswordEncoded " + suhailPasswordEncoded);
//		
//		String shaliniEncodedPassword = this.passwordEncoder().encode("Singh");
//		System.out.println("shaliniEncodedPassword "+shaliniEncodedPassword);
//
//		auth.inMemoryAuthentication().withUser("Suhail").password(suhailPasswordEncoded).roles("EMPLOYEE");
//		auth.inMemoryAuthentication().withUser("Shalini").password(shaliniEncodedPassword).roles("ADMIN");
//		
////		auth.userDetailsService(customUserDetailsService).passwordEncoder(this.passwordEncoder());
////		System.out.println("inside configurer...2");
//	}
	
	

}
