//package com.tongtong.cpp.Config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
////@Configuration
////@EnableAuthorizationServer
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//	static final String CLIEN_ID = "pias_evss";
//	static final String CLIENT_SECRET = "$2a$10$3.//YFnVH3icdlwot1r1celHsgnMmXpkeDeQsyKZ.HEmmIIycEU9a"; // 654321
//	static final String GRANT_TYPE_PASSWORD = "password";
//	static final String AUTHORIZATION_CODE = "authorization_code";
//	static final String REFRESH_TOKEN = "refresh_token";
//	static final String IMPLICIT = "implicit";
//	static final String SCOPE_READ = "read";
//	static final String SCOPE_WRITE = "write";
//	static final String TRUST = "trust";
//	static final int ACCESS_TOKEN_VALIDITY_SECONDS = 24 * 60 * 60;
//	static final int FREFRESH_TOKEN_VALIDITY_SECONDS = 24 * 60 * 60;
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
////	@Autowired
////	private UserDetailsService userDetailsService;
//
////	@Override
////	public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
////		oauthServer.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
////	}
//
//	@Override
//	public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {
//		// @formatter:off
////		configurer.withClientDetails(clientDetailsService);
//		configurer.inMemory().withClient(CLIEN_ID).secret(CLIENT_SECRET)
//				.authorizedGrantTypes(GRANT_TYPE_PASSWORD, AUTHORIZATION_CODE, REFRESH_TOKEN, IMPLICIT)
//				.scopes(SCOPE_READ, SCOPE_WRITE, TRUST).accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY_SECONDS)
//				.refreshTokenValiditySeconds(FREFRESH_TOKEN_VALIDITY_SECONDS);
//		// @formatter:on
//	}
//
////	@Autowired
////	private DataSource dataSource;
//
//
//
////	@Autowired
////	JdbcAuthorizationCodeServices authorizationCodeServices;
//
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		// @formatter:off
//		endpoints.tokenStore(tokenStore()).accessTokenConverter(accessTokenConverter())// .reuseRefreshTokens(true)
//				.authenticationManager(this.authenticationManager)
////				.userDetailsService(userDetailsService)
////			.authorizationCodeServices(authorizationCodeServices)
//		;
//		// @formatter:on
//	}
//
//	// @Override
//	// @Bean
//	// public AuthenticationManager authenticationManagerBean() throws
//	// Exception {
//	// return super.authenticationManagerBean();
//	// }
//
//	@Bean
//	public TokenStore tokenStore() {
////		return new JdbcTokenStore(dataSource);
//		return new JwtTokenStore(accessTokenConverter());
//	}
//
//	@Bean
//	public JwtAccessTokenConverter accessTokenConverter() {
//		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//		converter.setSigningKey("ojfl%loLU938234%$12!*^");
//		return converter;
//	}
//
//	@Bean
//	@Primary
//	public DefaultTokenServices tokenServices() {
//		DefaultTokenServices tokenServices = new DefaultTokenServices();
//		tokenServices.setSupportRefreshToken(true);
//		tokenServices.setTokenStore(tokenStore());
//		return tokenServices;
//	}
//}
