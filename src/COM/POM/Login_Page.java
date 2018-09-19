package COM.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	//declaration
	
	@FindBy(id="username")
	private WebElement UeserName_Textfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd_Textfield;
	
	@FindBy(id="loginButtonContainer")
	private WebElement loggin_button;
	
	//Initialization
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void loginMethod() throws InterruptedException {
		UeserName_Textfield.sendKeys("admin");
		pwd_Textfield.sendKeys("manager");
		loggin_button.click();
		Thread.sleep(6000);
	}
	
	

}
