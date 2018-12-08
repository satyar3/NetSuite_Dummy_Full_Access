package dummy.ey.allproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RoleSelectionProperty {
	
	public static String roleSelectionSection_xpath;
	public static String envSpecificRole_xpath;
	
	public static void loadRoleSelectionProp() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Back Up\\Project Work\\Learning Stuffs\\Selenium Training By Jitendra\\Self Study\\Programs\\NetSuite_Dummy_Full_Access_Project\\src\\dummy\\ey\\config\\roles.properties");
		
		prop.load(fs);
		
		roleSelectionSection_xpath = prop.getProperty("roleSelectionSection_xpath");
		envSpecificRole_xpath = prop.getProperty("envSpecificRole_xpath");
	}

}
