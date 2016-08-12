package com.github.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取属性文件工具类
 * created by xiongqi on 2016-8-12.
 */
public class Resources {
	
	/**
	 * 从绝对路径下读取properties文件
	 * @param url
	 * @return
	 * @throws Exception
	 */
	public static Properties getUrlAsProperties(String url) {
		Properties p = null;
		try(InputStream is = new FileInputStream(url)) {
			p = new Properties();
			p.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	/**
	 * 从类路径下读取properties文件
	 * @param resource
	 * @return
	 * @throws Exception
	 */
	public static Properties getResourceAsProperties(String resource) {
		Properties p = null;
		try(InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource)) {
			p = new Properties();
			p.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

}
