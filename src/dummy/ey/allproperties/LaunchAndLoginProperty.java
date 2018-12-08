package dummy.ey.allproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LaunchAndLoginProperty 
{
	
	public static String url;
	
	public static String username;
	public static String password;
	
	public static String userName_xpath;
	public static String password_xpath;
	
	public static String submitButton_xpath;
	
	public static String qtn1;
	public static String ans1;
	
	public static String stg1Role_choose_xpath;
	
	public static String qtn1_xpath;
	public static String ans1_xpath;
	
	public static String submitSecuritySection;
	
	public static void loadConfigFile() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Back Up\\Project Work\\Learning Stuffs\\Selenium Training By Jitendra\\Self Study\\Programs\\NetSuite_Dummy_Full_Access_Project\\src\\dummy\\ey\\config\\launchandlogin.properties");
		prop.load(ip);
		System.out.println("Properties have been loaded");
		
		//URL Loading
		url = prop.getProperty("url");
		System.out.println(url);
		
		
		//Credentials to Log In
		username = prop.getProperty("userName");
		password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		
		//Xpaths of credentials field
		userName_xpath = prop.getProperty("userName_xpath");
		password_xpath = prop.getProperty("password_xpath");
		System.out.println(userName_xpath);
		System.out.println(password_xpath);
		
		submitButton_xpath = prop.getProperty("submitButton_xpath");
		System.out.println(submitButton_xpath);
		
		//Xpath to choose environment/role
		stg1Role_choose_xpath = prop.getProperty("stg1Role_choose_xpath");
		
		
		//Security check questions
		qtn1 = prop.getProperty("qtn1");
		ans1 = prop.getProperty("ans1");
		
		System.out.println(qtn1);
		System.out.println(ans1);
		
		//xpaths of security questions and submit button
		qtn1_xpath = prop.getProperty("qtn1_xpath");
		ans1_xpath = prop.getProperty("ans1_xpath");
		
		System.out.println(qtn1_xpath);
		System.out.println(ans1_xpath);
		
		submitSecuritySection = prop.getProperty("submitSecuritySection");
	}
}
