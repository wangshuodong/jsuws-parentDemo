package com.cmiot.jsuws.wsb.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public abstract class PropertiesUtils {

	private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

	private static Properties props;

	static {
		try {
			props = new Properties();
			String location = "application.properties";
			Resource[] resources = new PathMatchingResourcePatternResolver()
					.getResources(location);

			for (Resource resource : resources) {
				PropertiesLoaderUtils.fillProperties(props, resource);
			}
		} catch (IOException e) {
			logger.error("加载配置文件出错", e);
		}
	}

	public static String getProperty(String key) {
		return props.getProperty(key);
	}

}
