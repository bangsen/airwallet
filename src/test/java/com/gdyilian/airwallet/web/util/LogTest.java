package com.gdyilian.airwallet.web.util;

import junit.framework.Assert;

import org.junit.Test;

import com.gdyilian.airwallet.web.util.LogUtil;

public class LogTest {

	@Test
	public void testLog(){
		Assert.assertNotNull(LogUtil.getLogger());
		LogUtil.getLogger().error("this is a error msg.");
		LogUtil.getLogger().warn("this is a warn msg.");
		LogUtil.getLogger().info("this is a info msg.");
		LogUtil.getLogger().debug("this is a debug msg.");
		LogUtil.getLogger().trace("this is a trace msg.");//not print if level is debug
		Assert.assertTrue(true);
	}
	
}
