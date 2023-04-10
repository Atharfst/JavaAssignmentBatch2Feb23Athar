package assignment2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigRead {

	public Properties prop;

	public ConfigRead() throws Exception {

		FileInputStream fis = new FileInputStream("./data/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getApplicationURL() {

		String url = prop.getProperty("appURL");

		return url;

	}

	public String getEmail() {

		return prop.getProperty("adminUserName");

	}

	public String getPassword() {
		return prop.getProperty("adminPassword");
	}

}
