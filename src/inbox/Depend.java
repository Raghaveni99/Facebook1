package inbox;

import org.testng.annotations.Test;

public class Depend 
{
	@Test
	public void compose()
	{
		System.out.println("compose");
	}
	@Test(groups="regression")	//Regression Testcase
	public void sentitems()
	{
		System.out.println("sent items");
		System.out.println("regression test case as sentitems");
	}
	@Test(groups="smoke")			//smoke test acse
	public void Trash()
	{
		System.out.println("Trash");
	}

}
