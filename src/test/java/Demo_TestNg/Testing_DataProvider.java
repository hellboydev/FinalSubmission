package Demo_TestNg;




import org.testng.annotations.Test;
import DataProviderWithExcel.HomePage;
import DataProviderWithExcel.ItemPage;



public class Testing_DataProvider
{
	//DataReader rd = new DataReader();


	
  @Test
    public void tstdata() throws InterruptedException 
  {
		HomePage hp = new HomePage();
		hp.openurl("https://demo.opencart.com/index.php?route=common/home&language=en-gb").clickOnDesktop();
		ItemPage ip=new ItemPage();
		ip.nextpage();
	}
	



}
