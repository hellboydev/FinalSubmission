package Demo_TestNg;

import org.testng.annotations.Test;

import DataProviderWithExcel.ItemPage;
import DataProviderWithExcel.loginPage;

public class Test_HomePage 
{
   

	
	  @Test
	    public void tstdata1() throws InterruptedException 
	  {
		    ItemPage ip=new ItemPage();
			ip.nextpage();
			loginPage lp=new loginPage();
			lp.nextOne();	
		
		}
		


	
}
