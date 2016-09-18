package lits.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrafartTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("http://trafart.com.ua/");
		
		WebElement element = driver.findElement(By.xpath (".//*[@id='sp-search']/div[1]/div/div/div/div/p[3]/input"));
		element.click();
		Thread.sleep(8000);
		WebElement element1 = driver.findElement(By.xpath("html/body/div[11]/span[8]/textarea"));
		element1.sendKeys("Андрей");
		Thread.sleep(8000);
		driver.quit();
		

	}

}
