package com.gdyilian.airwallet.persistence;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gdyilian.airwallet.domain.Role;
import com.gdyilian.airwallet.web.util.CommonUtil4T;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class RoleMapperTest {
	@Autowired
	private RoleMapper roleMapper;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQueryRoleById() {
		Role user = roleMapper.queryRoleById(2L);
		Assert.assertNotNull(user);
		Assert.assertNotNull(user.getRoleName());
	}

	@Test
	public void testSaveRole() {
		roleMapper.saveRole(CommonUtil4T.getTestRole());
		Assert.assertTrue(true);
	}

}
