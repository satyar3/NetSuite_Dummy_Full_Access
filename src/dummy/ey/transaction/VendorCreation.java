package dummy.ey.transaction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dummy.ey.allproperties.VendorProperties;

public class VendorCreation {
	
	public void vendorCreation(WebDriver driver) throws IOException, InterruptedException
	{
		VendorProperties.loadVendorProp();
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(VendorProperties.list_xpath))).build().perform();	
		System.out.println("List");
		
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath(VendorProperties.relationship_xpath))).build().perform();
		System.out.println("Relationship");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(VendorProperties.vendor_xpath)).click();
		System.out.println("Vendor");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(VendorProperties.newVendor_xpath)).click();
		System.out.println("New Vendor");
		
		System.out.println("On Vendor Page");
				
		//Select sel = new Select(driver.findElement(By.xpath(VendorProperties.CUSTOM_FORM_xpath)));
		//sel.selectByVisibleText("JM - Vendor Request");
		driver.findElement(By.xpath(VendorProperties.CUSTOM_FORM_xpath)).click();
		driver.findElement(By.xpath(VendorProperties.CUSTOM_FORM_Value_xpath)).click();
		
		driver.findElement(By.xpath(VendorProperties.VENDOR_NAME_xpath)).sendKeys(VendorProperties.vendor_name);
		driver.findElement(By.xpath(VendorProperties.LEGAL_NAME_xpath)).sendKeys(VendorProperties.vendor_last_name);
		driver.findElement(By.xpath(VendorProperties.VENDOR_GROUP_xpath)).sendKeys(VendorProperties.vendor_group);
		driver.findElement(By.xpath(VendorProperties.VENDOR_CLASS_xpath)).sendKeys(VendorProperties.vendor_class);
		
		scrollDown(driver);
		
		driver.findElement(By.xpath(VendorProperties.Address_Line_xpath)).click();
		driver.findElement(By.xpath(VendorProperties.Edit_Address_xpath)).click();
		
		Thread.sleep(2000);
		scrollDown(driver);
		driver.switchTo().frame("childdrecord_frame");
		driver.findElement(By.xpath(VendorProperties.Address_type_xpath)).sendKeys(VendorProperties.Address_type_value_xpath);
		//driver.findElement(By.xpath(VendorProperties.Address_type_value_xpath)).click();
		driver.findElement(By.xpath(VendorProperties.Address_Save_button_xpath)).click();
		
		scrollUp(driver);
		driver.findElement(By.xpath(VendorProperties.Vendor_Save_button_xpath)).click();
		
		
		if(!(driver.switchTo().alert()).equals(null))
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			
		}
				
		if(driver.findElement(By.xpath(VendorProperties.vendor_success_xpath)).getText().startsWith("Vendor successfully Saved"))
		{
			System.out.println("vendor Saved successfully");
		}
	}
	
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2500)", "");
	}
	public void scrollUp(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-2500)", "");
	}
}
