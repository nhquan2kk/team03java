package com.team3.util;

import java.io.IOException;
import java.util.Properties;

import com.team3.util.CommonConstants;

public class CommonUtil {
	public static final Properties properties = new Properties();
	
	static {
		try {
			properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	

	
}
