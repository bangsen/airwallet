package com.gdyilian.airwallet.web.util;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import junit.framework.Assert;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.gdyilian.airwallet.dao.util.ConnectorUtil;

public class ConnectorUtilTest {

	@Test
	public void testTestOpenSession() throws IOException {
		SqlSession sqlSession = ConnectorUtil.openSession();
		Assert.assertNotNull(sqlSession);
	}

}
