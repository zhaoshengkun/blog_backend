//package com.tongtong.cpp.Config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
////@Configuration
////@EnableWebSecurity(debug = false)
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
//
////	@Autowired
////	UserDetailsService userDetailsService;
//
////	@Autowired
////	AuthenticationSuccessHandler successHandler;
//
////	@Override
////	protected UserDetailsService userDetailsService() {
////		return userDetailsService;
////	}
//
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder();
////	}
//
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		// @formatter:off
////		http.csrf().disable().cors()
//		//
////				.and().exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint)
//				//
////				.and().authorizeRequests().anyRequest().authenticated()
//				// URL[/actuator/**]のREQUESTを禁止する
////				.and().authorizeRequests().antMatchers("/actuator/**").hasAuthority("ADMIN")
//				//
////				.and().authorizeRequests().antMatchers("/login", "/oauth/token", "/api/evss/1.0/public/**").permitAll()
//				//
////				.and().formLogin().permitAll().successHandler(successHandler)
//				//
////				.and().logout()
////				;
////		;
//		// @formatter:on
//
////	}
//
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
////	}
//
////	@Override
////	public void configure(WebSecurity web) {
////		web.ignoring().antMatchers("/resources/**", "/api/**", "/oauth/token");
////	}
//
////	@Override
////	@Bean
////	public AuthenticationManager authenticationManagerBean() throws Exception {
////		return super.authenticationManagerBean();
////	}
//
////	@Bean
////	public FilterRegistrationBean filterRegistrationBean() {
////		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////		CorsConfiguration config = new CorsConfiguration();
////		config.setAllowCredentials(true);
////		config.addAllowedOrigin("*");
////		config.addAllowedHeader("*");
////		config.addAllowedMethod("*");
////		source.registerCorsConfiguration("/**", config);
////		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
////		bean.setOrder(0);
////		return bean;
////	}
//
//}