package dummy.ey.transaction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dummy.ey.allproperties.LaunchAndLoginProperty;

public class LogIn {
	
	public void logInMethod(WebDriver driver) throws IOException, InterruptedException
	{
		LaunchAndLoginProperty.loadConfigFile();
		driver.get(LaunchAndLoginProperty.url);
		driver.findElement(By.xpath(LaunchAndLoginProperty.userName_xpath)).sendKeys(LaunchAndLoginProperty.username);
		driver.findElement(By.xpath(LaunchAndLoginProperty.password_xpath)).sendKeys(LaunchAndLoginProperty.password);
		driver.findElement(By.xpath(LaunchAndLoginProperty.submitButton_xpath)).click();
		
		//To select environment/role
		driver.findElement(By.xpath(LaunchAndLoginProperty.stg1Role_choose_xpath)).click();
		System.out.println("Environment selected");
		
		if(driver.getTitle().equals("Additional Authentication Required"))
		{
			System.out.println("Security check required");
			securityAns(driver);			
			driver.findElement(By.xpath(LaunchAndLoginProperty.submitSecuritySection)).click();
		}
		
		if(driver.getTitle().startsWith("Home"))
		{
			//System.out.println("Log in Successful");
		}
	}
	void securityAns(WebDriver driver) throws InterruptedException
	{
		String qtn1 = "What is your oldest brother's birthday month and year? (e.g., January 1900)";
		System.out.println("Security question is : "+qtn1);
		System.out.println(driver.findElement(By.xpath(LaunchAndLoginProperty.qtn1_xpath)).getText());

		if (driver.findElement(By.xpath(LaunchAndLoginProperty.qtn1_xpath)).getText().equals(qtn1))
		{
			driver.findElement(By.xpath(LaunchAndLoginProperty.ans1_xpath)).sendKeys(LaunchAndLoginProperty.ans1);
		}		
	}
}
