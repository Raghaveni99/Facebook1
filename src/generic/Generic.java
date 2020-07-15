package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}
	@Parameters("browser")
	@BeforeMethod
	public void openAppln(String browser)
	{
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.google.com");
			
		}else{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
		}
	}										
	@AfterMethod
	public void closeAppln()
	{
		driver.quit();
	}
}
