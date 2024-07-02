package workingWithTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility {
		
		public String getDataFromProperties(String key) throws IOException
		{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/CommonData.properties/");

		Properties pobj= new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		System.out.println(value);
		return value;

	}
	}


