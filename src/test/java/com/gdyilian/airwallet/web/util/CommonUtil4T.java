package com.gdyilian.airwallet.web.util;

import com.gdyilian.airwallet.domain.Role;
import com.gdyilian.airwallet.domain.User;
import com.gdyilian.airwallet.domain.UserRole;

public class CommonUtil4T {
	public static User getTestUser() {
		User user = new User();
		user.setId(System.currentTimeMillis());
		user.setUsername("fn");
		user.setPassword("jkl");
		user.setRegDate(new java.util.Date());
		user.setAddress("addr");
		user.setEmail("020fj@163.com");
		user.setMobileNo("15966423132");
		user.setSex('f');
		return user;
	}

	public static Role getTestRole() {
		Role role = new Role();
		role.setId(System.currentTimeMillis());
		role.setRoleName("ROLE_" + System.currentTimeMillis());
		return role;
	}

	public static UserRole getTestUserRole() {
		UserRole userRole = new UserRole();
		userRole.setRoleId(System.currentTimeMillis());
		userRole.setUserId(System.currentTimeMillis());
		return userRole;
	}

}
