package com.cmiot.jsuws.wsb.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class PropertiesUtils {

	private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

	private static Properties props;

	static {
		try {
			props = new Properties();
			String path =System.getProperty("jsuws.config.path");
			FileInputStream fileInputStream = new FileInputStream(path);
			props.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			logger.error("加载配置文件出错", e);
		}
	}

	public static String getProperty(String key) {
		return props.getProperty(key);
	}

}
