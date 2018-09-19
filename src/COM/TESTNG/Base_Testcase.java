package COM.TESTNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Testcase {
	
	public WebDriver driver;
	
	@BeforeMethod
	public  void ActitimeApp() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
	}
	
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
