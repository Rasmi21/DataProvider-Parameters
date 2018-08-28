package One;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Volumes/RASMI 1/Eclipse Jars/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://toolsqa.com");
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='primary-menu\']/li[8]"))).build().perform();
		
}
}