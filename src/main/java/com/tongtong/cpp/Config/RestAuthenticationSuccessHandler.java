//package com.tongtong.cpp.Config;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
////@Component
//public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
////	
//////	 @Autowired
//////	 TokenGranter tokenHelper;
////
////	@Override
////	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
////			Authentication authentication) throws IOException, ServletException {
////		clearAuthenticationAttributes(request);
////		User user = (User) authentication.getPrincipal();
////		
////		Object cred = authentication.getCredentials();
////		
//////		System.out.println(cred);
////		
//////		String jwt = tokenHelper.
//////				.generateToken(user.getUsername());
//////
//////		UserTokenState userTokenState = new UserTokenState(jwt, EXPIRES_IN);
//////		try {
//////			String jwtResponse = objectMapper.writeValueAsString(userTokenState);
//////			response.setContentType("application/json");
//////			response.getWriter().write(jwtResponse);
//////		} catch (Exception e) {
//////		}
////	}
////
//}
