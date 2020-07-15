package inbox;

import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel 
{
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void Compose(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	
	
	if(browser.equals("chrome"))
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
//	else
//	{
//		driver =new ChromeDriver();
//		driver.get("https://www.google.com");
//	}
//	
}
}