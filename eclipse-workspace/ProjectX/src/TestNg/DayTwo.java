package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayTwo {
	@Test(groups= {"Smoke"})
	public static void ploan(){
		
		System.out.println("good");
	}
	@BeforeTest
	public static void prerequiste() {
		System.out.println("this is will be excuted first ");
		
	}
	@AfterTest
	public static void lastexcution() {
		System.out.println("this is will be excuted last ");
		
	}

	

}
