package lits.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {

	public static void main(String[] args) {
		
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.google.com.ua");
      WebElement element = driver.findElement(By.id("gs_htif0"));
      element.sendKeys("франция - румуния");
      driver.quit();
	}

}
