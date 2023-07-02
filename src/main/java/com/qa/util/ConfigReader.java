package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;

	public static Properties init_properties() throws IOException {

		prop = new Properties();
		try {
			FileInputStream fp = new FileInputStream("./src/main/java/com/qa/util/Constants.properties");
			prop.load(fp);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return prop;

	}

}
