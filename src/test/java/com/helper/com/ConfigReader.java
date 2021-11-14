package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	public static Properties p;

	public ConfigReader() throws Throwable {
		File f = new File(
				"C:\\Users\\HARI\\eclipse-workspace\\ZCucumber\\src\\test\\java\\com\\config\\com\\Config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String browser() {
		String browser = p.getProperty("browser");
		return browser;

	}

	public String url() {
		String url = p.getProperty("url");
		return url;
	}


}
