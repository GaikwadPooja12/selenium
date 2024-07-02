package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ExamplePropertiesFile {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties/");

		Properties pobj= new Properties();
		pobj.load(fis);
		String value1=pobj.getProperty("url");
		System.out.println(value1);
	}

}
