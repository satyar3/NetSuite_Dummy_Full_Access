package dummy.ey.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import dummy.ey.transaction.BrowserLaunch;
import dummy.ey.transaction.LogIn;
import dummy.ey.transaction.SelectRole;
import dummy.ey.transaction.VendorCreation;

public class Runner {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Launching Browser
		BrowserLaunch browserlaunch = new BrowserLaunch();
		WebDriver driver = browserlaunch.setBrowser("chrome");
		System.out.println("Chrome Browser Launched");
		
		//Login to website
		LogIn login = new LogIn();
		login.logInMethod(driver);
		System.out.println("Log in successful");
		
		//Role selection
		SelectRole selrole = new SelectRole();
		selrole.roleSelection(driver,"Stage2");		
		System.out.println("Role has been changed");
		
		//List
		VendorCreation createVendor = new VendorCreation();
		createVendor.vendorCreation(driver);
	}

}
