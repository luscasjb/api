/*package com.integracao.compras.api.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfiguration {*/

	/*@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Bean
	public UserDetailsService userDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder) {
	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	    manager.createUser(User.withUsername("user")
	      .password(bCryptPasswordEncoder.encode("userPass"))
	      .roles("USER")
	      .build());
	    manager.createUser(User.withUsername("admin")
	      .password(bCryptPasswordEncoder.encode("adminPass"))
	      .roles("USER", "ADMIN")
	      .build());
	    return manager;
	}
	
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsService userDetailService) 
	  throws Exception {
	    return http.getSharedObject(AuthenticationManagerBuilder.class)
	      .userDetailsService(autenticacaoService)
	      .passwordEncoder(new bCryptPasswordEncoder)
	      .and()
	      .build();
	}*/
	
	/* @Bean
	 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		 http.csrf()
	      .disable()
	      .authorizeRequests()
	      .antMatchers(HttpMethod.GET, "/pedidos").permitAll()
	      .antMatchers(HttpMethod.GET, "/pedidos/*").permitAll()
	      .antMatchers(HttpMethod.POST, "/auth").permitAll()
	      .antMatchers(HttpMethod.GET, "/actuator/**").permitAll()
	      .and().csrf().disable()
	      .sessionManagement()
	      .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		 return http.build();
	 }
	
	
}*/
