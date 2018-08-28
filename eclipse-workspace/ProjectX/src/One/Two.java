package One;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Volumes/RASMI 1/Eclipse Jars/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.id("fsettl")).click();
		driver.findElement(By.xpath("//a[@href='/advanced_search?hl=en&fg=1\']")).click();
		driver.findElement(By.xpath("//*[@id='CwYCWc\']")).sendKeys("CNN");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/form/div[5]/div[9]/div[2]/input")).click();

	}

}
