package com.gdyilian.airwallet.persistence;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gdyilian.airwallet.domain.Role;
import com.gdyilian.airwallet.domain.UserRole;
import com.gdyilian.airwallet.web.util.CommonUtil4T;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserRoleMapperTest {
	@Autowired
	private UserRoleMapper userRoleMapper;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQueryUserRoleByUserId() {
		List<UserRole> userRoleList = userRoleMapper.queryUserRoleByUserId(1L);
		Assert.assertNotNull(userRoleList);
		Assert.assertFalse(userRoleList.isEmpty());
	}
	
	@Test
	public void testQueryUserRoleByRoleId() {
		List<UserRole> userRoleList = userRoleMapper.queryUserRoleByRoleId(1L);
		Assert.assertNotNull(userRoleList);
		Assert.assertFalse(userRoleList.isEmpty());
	}

	@Test
	public void testSaveRole() {
		userRoleMapper.saveUserRole(CommonUtil4T.getTestUserRole());
		Assert.assertTrue(true);
	}

}
