package COM.TESTNG;

import org.testng.annotations.Test;
import COM.POM.Login_Page;

public class ActiTime_Login  extends Base_Testcase{
	
	@Test
	public void logina_page() throws InterruptedException {
	Login_Page login=new Login_Page(driver);
	login.loginMethod();
	Thread.sleep(6000);
	}

}
