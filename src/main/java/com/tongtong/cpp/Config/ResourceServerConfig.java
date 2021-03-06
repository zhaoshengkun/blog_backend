///*
// * Copyright 2014-2015 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.tongtong.cpp.Config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
//
//
////@Configuration
////@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
////
////	private static final String RESOURCE_ID = "resource_id";
////	
////	@Autowired
////	DefaultTokenServices tokenServices;
////
////	@Override
////	public void configure(ResourceServerSecurityConfigurer resources) {
////		// @formatter:off
////		resources.resourceId(RESOURCE_ID).stateless(false);
////		resources.tokenServices(tokenServices);
////		// resources.to
////		// @formatter:on
////	}
////
//////	@Bean
//////	public TokenStore tokenStore() {
//////		return new JwtTokenStore(accessTokenConverter());
//////	}
//////
//////	@Bean
//////	public JwtAccessTokenConverter accessTokenConverter() {
//////		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//////		converter.setSigningKey("ojfl%loLU938234%$12!*^");
//////		return converter;
//////	}
////
//////	@Bean
//////	@Primary
//////	public DefaultTokenServices tokenServices() {
//////		DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//////		defaultTokenServices.setTokenStore(tokenStore());
//////		return defaultTokenServices;
//////	}
////
////	@Override
////	public void configure(HttpSecurity http) throws Exception {
//////		http.headers().frameOptions().disable();
////		// @formatter:off
//////		http.csrf().disable().cors().and().anonymous().disable().authorizeRequests()
//////				.antMatchers("/api/evss/1.0/public/**", "/static/**", "/webjars/**", "/views/**").permitAll().and()
//////				.authorizeRequests().anyRequest().authenticated();
////		// @formatter:on
////		
////		http.cors().and().csrf().disable().authorizeRequests().antMatchers("/api/evss/1.0/public/**").permitAll();
////	}
////
//}
