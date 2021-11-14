package com.helper.com;

public class FileReaderManager {

	private FileReaderManager() {
	}

	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	public ConfigReader getInstanceCR() throws Throwable {
		ConfigReader cr = new ConfigReader();
		return cr;
	}

}
