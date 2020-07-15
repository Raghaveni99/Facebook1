package inbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies 
{
	@Test
	public void compose()						//test case pass
	{
		System.out.println("Compose");
	}
	
	@Test(dependsOnMethods="compose")			//test case skip
	public void sentitems() throws Exception
	{
		System.out.println("sentitems");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="sentitems")			//test case skip bex depends on methods is fail
	public void Trash()
	{
		System.out.println("Trash");
	}

}
