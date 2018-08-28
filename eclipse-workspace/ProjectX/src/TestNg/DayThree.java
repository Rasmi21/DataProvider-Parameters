package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class DayThree {
@Parameters({"URL","Username","Password"})
@Test
public void webLoginhomeLoan(String URLname, String User, String Pass) {
	System.out.println("webLoginhomeLoan"+"   " + URLname);
	System.out.println("webLoginhomeLoan"+ "  " +  User);
	System.out.println("webLoginhomeLoan"+ "  " +  Pass);
}
@Test
public void MobilesigninhomeLoan() {
	System.out.println("MobilesigninhomeLoan");	
}
@Test
public void MobilesignouthomeLoan() {
	System.out.println("MobilesignouthomeLoan");	
}
@Test
public void MobileloginhomeLoan() {
	System.out.println("MobileloginhomeLoan");	
}

@Test(groups= {"Smoke"})
public void LoginAPIhomeLoan() {
	System.out.println("LoginAPIhomeLoan");		
}
@BeforeMethod 
public void BM() {
	System.out.println("this will be excuted before each on of the DayThree Methods");
}

@AfterMethod

public void AM() {
	System.out.println("this will be excuted After each on of the DayThree Methods");
}
@BeforeClass 
public void BC() {
	System.out.println("this will be excuted before each on of the DayThree Class");
}
@AfterClass 
public void AC() {
	System.out.println("this will be excuted after each on of the DayThree Class");
}
}
