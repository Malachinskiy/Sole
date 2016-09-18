package lits.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SoleTesting {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	      driver.get("http://sole.com.ua");
	      
	      WebElement element = driver.findElement(By.name("searchword"));
	      element.sendKeys("Hamburg - Oslo");
	      element.click();
	      element.submit();
	      WebElement element1 = driver.findElement(By.className("search-result-overlay"));
	      element1.submit();
	      
	      /*
	      WebElement element = driver.findElement(By.id("mce-EMAIL"));
	      element.sendKeys("ikdfsf");
	      WebElement element1 = driver.findElement(By.id("mc-embedded-subscribe"));
	      element1.submit();
	      */
	      
	      (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.getTitle().toLowerCase().startsWith("selenium");
	            }
	        });
	      
	      driver.quit();
	}

}
