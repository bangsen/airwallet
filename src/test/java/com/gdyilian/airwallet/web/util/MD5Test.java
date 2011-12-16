package com.gdyilian.airwallet.web.util;

import junit.framework.Assert;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class MD5Test extends MD5 {

	@Test
	public void testGetMD5ofStr() {
		  MD5 m = new MD5();
          System.out.println("MD5 Test suite:");
          String s1 = "0200 1413751744046|6226090200684773 190000 000000100.00 0913125401 REF 05023141 02302020000001 2011091300000011 01 123456";
          String encS1 = m.getMD5ofStr(s1);
          Assert.assertNotNull(encS1);
          System.out.println("MD5(\"dna\"):"+encS1);
          String encS2 = DigestUtils.md5Hex(s1);
          Assert.assertNotNull(encS2);
          Assert.assertEquals(StringUtils.upperCase(encS1), StringUtils.upperCase(encS2) );
	}

}
