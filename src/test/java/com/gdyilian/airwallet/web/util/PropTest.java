package com.gdyilian.airwallet.web.util;

import junit.framework.Assert;

import org.junit.Test;

import com.gdyilian.airwallet.web.util.Constants;
import com.gdyilian.airwallet.web.util.LogUtil;
import com.gdyilian.airwallet.web.util.PropertiesUtil;

public class PropTest {

	@Test
	public void testProp(){
		String sp = PropertiesUtil.getValue(Constants.SP_CODE);
		Assert.assertNotNull(sp);
		Assert.assertNotSame(sp, "");
		Assert.assertTrue(true);
	}
	
}
