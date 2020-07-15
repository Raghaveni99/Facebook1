package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	private static final WebElement Login = null;
	//Declaration
	@FindBy(id="username")
	private WebElement untbox;
	@FindBy(id="pwd")
	private WebElement pwdtbox;
	@FindBy(xpath="//div[.='Login']")
	private WebElement login;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	public void setUsername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		Login.click();
	}
}
