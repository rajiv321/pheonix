package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public  class Uimapper {
	static Properties prop  = new Properties();
	static FileInputStream  properties = null;
	
	static {
		load_properties();
		
	}
	
	public static void load_properties() {
		
		try {
			properties = new FileInputStream("./src/main/java/util/stage.properties");
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
		try {
			prop.load(properties);
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	
	public static String getElement(String key)
	{
		 return (String) prop.get(key);
	}
	

}
