package lits.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.ua");
		
		WebElement element = driver.findElement(By.xpath (".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		element.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
		email.sendKeys("kakashka");
		Thread.sleep(500);
		WebElement next = driver.findElement(By.xpath(".//*[@id='next']"));
		next.click();
		Thread.sleep(500);
		WebElement password = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		Thread.sleep(500);
		password.sendKeys("123456");
		
		WebElement signin = driver.findElement(By.xpath(".//*[@id='signIn']"));
		signin.click();
		
		driver.quit();
	}

}
