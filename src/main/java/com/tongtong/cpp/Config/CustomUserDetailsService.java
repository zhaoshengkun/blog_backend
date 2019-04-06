//package com.tongtong.cpp.Config;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.panasonic.pias.evss.dao.service.UserInfoService;
//import com.panasonic.pias.evss.model.UserInfoModel;
//
//import tk.mybatis.mapper.entity.Condition;
//
//@Component
//public class CustomUserDetailsService implements UserDetailsService {
//
//	private final Logger logger = LoggerFactory.getLogger(getClass());
//
//	@Autowired
//	private UserInfoService userInfoService;
//	//
//	// @Resource
//	// private EvaluationAuthorityService evaluationAuthorityService;
//
//	@Override
//	@Transactional
//	public UserDetails loadUserByUsername(final String login) {
//
//		logger.debug("loadUserByUsername {}", login);
//
//		Condition condition = new Condition(UserInfoModel.class);
//		condition.createCriteria().andCondition("mobile_number = " + login);
//		List<UserInfoModel> users = userInfoService.findByCondition(condition);
//		// EmployeeModel userFromDatabase =
//		// userService.findByIdGidAndIdEvaluateYear(login, currentEvaluateYear);
//
//		// EvaluationAuthorityModel userFromDatabase = null;
//		// List<EvaluationAuthorityModel> evaluationAuthorityModels =
//		// evaluationAuthorityService.findByIdGidAndIdEvaluateYear(login,
//		// currentEvaluateYear);
//		// if(!CollectionUtils.isEmpty(evaluationAuthorityModels)) {
//		// userFromDatabase = evaluationAuthorityModels.get(0);
//		// }
//
//		// if (lowercaseLogin.contains("@")) {
//		// userFromDatabase = userRepository.findByEmail(lowercaseLogin);
//		// } else {
//		// userFromDatabase = userRepository
//		// .findByUsernameCaseInsensitive(lowercaseLogin);
//		// }
//
//		if (users.size() == 0) {
//			throw new UsernameNotFoundException("User " + login + " was not found in the database");
//		} else {
//			// go on
//		}
//		UserInfoModel loginUser = users.get(0);
//		// else if (!userFromDatabase.isActivated()) {
//		// throw new UserNotActivatedException("User " + lowercaseLogin
//		// + " is not activated");
//		// }
//
//		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
//		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
//		grantedAuthorities.add(grantedAuthority);
//		// grantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
//		// grantedAuthorities.add(grantedAuthority);
//
//		// for (Authority authority : userFromDatabase.getAuthorities()) {
//		// GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(
//		// authority.getName());
//		// grantedAuthorities.add(grantedAuthority);
//		// }
//
//		return new User(loginUser.getMobileNumber(), loginUser.getPassword(), grantedAuthorities);
//
//	}
//
//}
