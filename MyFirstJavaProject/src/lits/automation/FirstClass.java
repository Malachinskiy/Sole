package lits.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {

	public static void main(String[] args) {
		
	   System.out.println("My first java app");
/*
	   int result;
	   
	   int a = 10;
	   int b = 12;
	   
	   int d = b - a - 2;
	   
	   result = a * b / d;
	   
	   System.out.println(result);
*/	  
	  
	   WebDriver driver = new FirefoxDriver();

       // ��������� ����, ��������� �������
       driver.get("http://www.google.com");
       // ��-������� ��� ����� ������� ���:
       // driver.navigate().to("http://www.google.com");

       // ������� ������� �� �������� name
       WebElement element = driver.findElement(By.name("q"));

       // ������ �����
       element.sendKeys("Selenium");

       // ���������� �����, ��� ���� ������ ��� ��������� ��� ��������� ����� �� ��������
       element.submit();

       // ��������� ����� ��������
       System.out.println("Page title is: " + driver.getTitle());

       // �������� ���� ����������� �������������� � ������� javascript
       // ���� �������� �������� � ��������� � 10 ������
       (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
           public Boolean apply(WebDriver d) {
               return d.getTitle().toLowerCase().startsWith("selenium");
           }
       });

       // ������� �������: "Selenium - Google Search"
       System.out.println("Page title is: " + driver.getTitle());

       // ��������� �������
       driver.quit();
	  
	}

}
