package crmProUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CrmProPractiseUtil {
	private Properties prop;
	private FileInputStream ip;
	
	
	
	public CrmProPractiseUtil()
	{
		 prop= new Properties();
		 try {
			 ip =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\crmProUtil\\CrmProPractise.properties");
			 prop.load(ip);
		 	 } catch (FileNotFoundException e) 
		 		{
				e.printStackTrace();
		 		} 
		 		catch (IOException e) 
		 			{
		 				e.printStackTrace();
		 			}
	 }
	
	public Properties getProp() {
		return prop;
	}
	
	
	
}
