package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Admin extends BaseClass {
	static WebDriver driver;
	@Test(priority=1)
	public void AdminDash() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	

}
