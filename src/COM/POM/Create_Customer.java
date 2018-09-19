package COM.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Customer {
	//declaration
	
	@FindBy(xpath="(//div[@class='label'])[2]")
	private WebElement Content_task;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement Addnew_Button;

	 
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement New_Customer_Button;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement Customer_Name_Textfield;
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement Create_Customer_Button;
	
	
	//inialization
	
	public Create_Customer(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	
	public void create_customer() throws InterruptedException {
		
		Content_task.click();
		Thread.sleep(5000);
		Addnew_Button.click();
		Thread.sleep(5000);
		New_Customer_Button.click();
		Thread.sleep(5000);
		Customer_Name_Textfield.sendKeys("subha2");
		Thread.sleep(5000);
		Create_Customer_Button.click();
	}

}
