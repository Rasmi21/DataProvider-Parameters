package OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass {
	
	static WebDriver driver;
//	@DataProvider({"Three"})
//	@Parameters({"Username","Password"})
	@Test(dataProvider="Three")
	public static void One(String User,String Pass) {
		System.setProperty("webdriver.chrome.driver", "/Volumes/RASMI 1/Eclipse Jars/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys(User);
		driver.findElement(By.id("txtPassword")).sendKeys(Pass);
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("this is one ");
	

		

	}
	
	@Test(priority=2)
	public void Two()  {
		System.out.println("this is two ");

	}
	@DataProvider
	public Object[][]  Three() {
		Object[][] data= new Object[3][2] ;
		 data [0][0]= "Admin";
		 data [0][1]= "admin123";
		 data [1][0]= "Admin1";
		 data [1][1]= "admin1234";
		 data [2][0]= "Admin2";
		 data [2][1]= "admin1235";
		return data;

	}
	
	

}
