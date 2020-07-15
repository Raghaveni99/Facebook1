package inbox;

import org.testng.annotations.Test;

import POM.EnterTimeTrack;
import POM.LoginPage;
import generic.Generic1;

public class Test1 extends Generic1
{
	@Test
		public void test_login() throws InterruptedException
		{
			LoginPage lp=new LoginPage(driver);
			lp.setUsername("admin");
			lp.setPassword("manager");
			Thread.sleep(3000);
			String title=driver.getTitle();
			System.out.println(title);
			EnterTimeTrack ep=new EnterTimeTrack(driver);
			ep.clickLogout();
		}
	 

}
