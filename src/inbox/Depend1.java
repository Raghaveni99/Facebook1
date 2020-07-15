package inbox;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Depend1
{
		@Parameters({"Country","City"})
		@Test
		public void Compose(String country,String city)
		{
			System.out.println(country);
			System.out.println(city);
		}
}


