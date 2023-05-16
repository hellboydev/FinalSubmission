package Demo_TestNg;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import DataProviderWithExcel.DataReader;
import DataProviderWithExcel.HomePage;
import DataProviderWithExcel.ItemPage;
import DataProviderWithExcel.loginPage;


public class Testing_DataProvider
{
	//DataReader rd = new DataReader();


	
  @Test
    public static void main(String[]args) throws InterruptedException {
		HomePage hp = new HomePage();
		hp.openurl("https://demo.opencart.com/index.php?route=common/home&language=en-gb").clickOnDesktop();
		ItemPage ip=new ItemPage();
		ip.nextpage();
		loginPage lp=new loginPage();
		lp.nextOne();
	
	}
	



}
