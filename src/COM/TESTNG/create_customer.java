package COM.TESTNG;

import org.testng.annotations.Test;

import COM.POM.Create_Customer;
import COM.POM.Login_Page;

public class create_customer extends Base_Testcase{
	
	@Test
	
	public void createcustomeractitime() throws InterruptedException {
		
		
		Login_Page login=new Login_Page(driver);
		login.loginMethod();
		Thread.sleep(6000);
		
		Create_Customer cc=new Create_Customer(driver);
		cc.create_customer();
		Thread.sleep(9000);
	}

}
