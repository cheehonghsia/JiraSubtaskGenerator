package com.zazu.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyRetriever {

	private Properties prop;
	private InputStream input;

	public PropertyRetriever() throws IOException {
		prop = new Properties();
		input = getClass().getClassLoader().getResourceAsStream("jira.properties");
		prop.load(input);
	}

	public String getSubtasks(String key) {
		return prop.getProperty(key);
	}
}