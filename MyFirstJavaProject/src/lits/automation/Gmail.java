package lits.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		
		WebDriver Driver = new FirefoxDriver();
        Driver.get("https://www.gmail.com/");
         WebElement wb= Driver.findElement(By.name("Email"));
         wb.sendKeys("sweta");
         WebElement wb1= Driver.findElement(By.name("Passwd"));
         wb1.sendKeys("123456");
         WebElement wb2= Driver.findElement(By.id("signIn"));
         wb2.click();
         WebElement wb3= Driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a"));
         wb3.click();
         WebElement wb4= Driver.findElement(By.id("gb_71"));
         wb4.click();

	}

}
