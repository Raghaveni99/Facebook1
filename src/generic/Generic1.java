package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic1 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	@BeforeMethod
	public void openAppln()
	{
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do;");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}

}
