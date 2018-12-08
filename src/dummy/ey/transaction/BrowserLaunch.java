package dummy.ey.transaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	WebDriver driver;
	public WebDriver setBrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Back Up\\Project Work\\Learning Stuffs\\Selenium Training By Jitendra\\Self Study\\Programs\\NetSuite_Dummy_Full_Access_Project\\src\\dummy\\ey\\exefiles\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Back Up\\Project Work\\Learning Stuffs\\Selenium Training By Jitendra\\Self Study\\Programs\\NetSuite_Dummy_Full_Access_Project\\src\\dummy\\ey\\exefiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		return driver;
	}
}
