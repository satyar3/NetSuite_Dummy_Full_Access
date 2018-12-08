package dummy.ey.allproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class VendorProperties {

	public static String list_xpath;
	public static String relationship_xpath;
	public static String vendor_xpath;
	public static String newVendor_xpath;
	
	public static String CUSTOM_FORM_xpath;
	public static String CUSTOM_FORM_Value_xpath;
	public static String VENDOR_NAME_xpath;
	public static String LEGAL_NAME_xpath;
	public static String VENDOR_GROUP_xpath;
	public static String VENDOR_GROUP_Value_xpath;
	public static String VENDOR_CLASS_xpath;
	public static String VENDOR_CLASS_Value_xpath;
	public static String Address_Line_xpath;
	public static String Edit_Address_xpath;
	public static String Address_type_xpath;
	public static String Address_type_value_xpath;
	public static String Address_Save_button_xpath;
	public static String Vendor_Save_button_xpath;
	
	public static String vendor_name;
	public static String vendor_last_name;
	public static String vendor_group;
	public static String vendor_class;
	public static String vendor_success_xpath;
	
	public static void loadVendorProp() throws IOException
	{
		Properties prop =  new Properties();
		FileInputStream fs =  new FileInputStream("C:\\Back Up\\Project Work\\Learning Stuffs\\Selenium Training By Jitendra\\Self Study\\Programs\\NetSuite_Dummy_Full_Access_Project\\src\\dummy\\ey\\config\\vendordetails.properties");
		prop.load(fs);
		
		list_xpath =  prop.getProperty("list_xpath");
		relationship_xpath =  prop.getProperty("relationship_xpath");
		vendor_xpath =  prop.getProperty("vendor_xpath");
		newVendor_xpath =  prop.getProperty("newVendor_xpath");
		
		CUSTOM_FORM_xpath =  prop.getProperty("CUSTOM_FORM_xpath");
		CUSTOM_FORM_Value_xpath =  prop.getProperty("CUSTOM_FORM_Value_xpath");
		VENDOR_NAME_xpath =  prop.getProperty("VENDOR_NAME_xpath");
		LEGAL_NAME_xpath =  prop.getProperty("LEGAL_NAME_xpath");
		VENDOR_GROUP_xpath =  prop.getProperty("VENDOR_GROUP_xpath");
		VENDOR_GROUP_Value_xpath =  prop.getProperty("VENDOR_GROUP_Value_xpath");
		VENDOR_CLASS_xpath =  prop.getProperty("VENDOR_CLASS_xpath");
		VENDOR_CLASS_Value_xpath =  prop.getProperty("VENDOR_CLASS_Value_xpath");
		
		Address_Line_xpath =  prop.getProperty("Address_Line_xpath");
		Edit_Address_xpath =  prop.getProperty("Edit_Address_xpath");
		
		Address_type_xpath = prop.getProperty("Address_type_xpath");
		Address_type_value_xpath = prop.getProperty("Address_type_value_xpath");
		
		Address_Save_button_xpath = prop.getProperty("Address_Save_button_xpath");
		Vendor_Save_button_xpath = prop.getProperty("Vendor_Save_button_xpath");
		
		vendor_name = prop.getProperty("vendor_name");
		vendor_last_name = prop.getProperty("vendor_last_name");
		vendor_group = prop.getProperty("vendor_group");
		vendor_class = prop.getProperty("vendor_class");
		vendor_success_xpath = prop.getProperty("vendor_success_xpath");
	}
}
