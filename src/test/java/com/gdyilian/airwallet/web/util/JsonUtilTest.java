package com.gdyilian.airwallet.web.util;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import junit.framework.Assert;

import org.apache.struts2.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gdyilian.airwallet.domain.User;


public class JsonUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	public static User getTestUser(){
		User user = new User();
		user.setId(System.currentTimeMillis());
		user.setUsername("fn");
		user.setPassword("jkl");
		user.setRegDate(new java.util.Date());
		return user;
	}
	/*@Test
	public void testObject2Json() throws IOException {
		String value = JsonUtil.object2Json(getTestUser());
		Assert.assertNotNull(value);
		Assert.assertNotSame("", value);
		LogUtil.getLogger().info(value);
	}*/
	/*	@Test
	public void testJson2Object() throws IOException {
		String value = JsonUtil.object2Json(getTestUser());
		Assert.assertNotNull(value);
		Assert.assertNotSame("", value);
		User user = (User) JsonUtil.json2Object(value, User.class);
		value = JsonUtil.object2Json(user);
		Assert.assertNotNull(user);
		LogUtil.getLogger().info(value);
		Assert.assertEquals(getTestUser().getUsername(), user.getUsername());
	}*/
	@Test
	public void testObject2JsonS2() throws IOException, JSONException {
		String value = org.apache.struts2.json.JSONUtil.serialize(getTestUser());
		Assert.assertNotNull(value);
		Assert.assertNotSame("", value);
		LogUtil.getLogger().info(value);
	}
	@Test
	public void testJson2ObjectS2() throws IOException, JSONException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, IntrospectionException, InstantiationException {
		String value = org.apache.struts2.json.JSONUtil.serialize(getTestUser());
		Assert.assertNotNull(value);
		Assert.assertNotSame("", value);
		User user2 = new User();
		JSONAWUtil.json2Object(user2, value);
		value = org.apache.struts2.json.JSONUtil.serialize(user2);
		Assert.assertNotNull(user2);                                                            
		LogUtil.getLogger().info(value);
		Assert.assertEquals(getTestUser().getUsername(), user2.getUsername());
	}

	
}
