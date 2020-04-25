package utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_Config extends BaseClass {
	
	
	static Properties property;

	public Read_Config() {
		File path = new File("./src/test/resources/Config.properties");
		try {
			FileInputStream fil = new FileInputStream(path);
			property = new Properties();
			property.load(fil);
		} catch (Exception e) {
			System.out.println("fileinput Exception" + e.getMessage());
			e.printStackTrace();
		}
	}

	public String baseurl() {
		String BaseURL = property.getProperty("BaseURL");
		return BaseURL;
	}
	public static String userID() {
		String EmailAddress = property.getProperty("UserID");
		return EmailAddress;
	}

	public static String password() {
		String Password = property.getProperty("Password");
		return Password;
	}
	

}
