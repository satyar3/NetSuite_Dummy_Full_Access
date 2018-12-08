package dummy.ey.transaction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import dummy.ey.allproperties.RoleSelectionProperty;

public class SelectRole {
	
	public void roleSelection(WebDriver driver, String envRole) throws IOException
	{
		RoleSelectionProperty.loadRoleSelectionProp();
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath(RoleSelectionProperty.roleSelectionSection_xpath))).build().perform();;
		
		driver.findElement(By.xpath(RoleSelectionProperty.roleSelectionSection_xpath)).click();
		
		if(envRole.equals("Stage2"))
		{
			driver.findElement(By.xpath(RoleSelectionProperty.envSpecificRole_xpath)).click();
		}
	}
	
}
