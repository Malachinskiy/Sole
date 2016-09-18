package lits.automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/Вова/workspace/MyFirstJavaProject/recources/chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://football.ua");
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });
		WebElement element = driver.findElement(By.xpath("//body/div[3]/form/header/div/div[2]/div[2]/ul/li[2]/a"));
		element.submit();
		driver.quit();
		

	}

}
