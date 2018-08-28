package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DayOne {
	
	@Test
	public void demo(){
		
		System.out.println("hello");
	}
	@Test(groups= {"Smoke"})
	public void secondTest(){
		
		System.out.println("bye");
	}
	
	@BeforeSuite 
	public void sutieTop() {
		System.out.println("this is excuted before the Loan Suite");
	}
	@AfterSuite 
	public void sutieBottom() {
		System.out.println("this is excuted after the Loan Suite");
	}

	
}
