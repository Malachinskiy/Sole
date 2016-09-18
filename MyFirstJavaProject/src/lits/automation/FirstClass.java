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

       // Открываем гугл, используя драйвер
       driver.get("http://www.google.com");
       // По-другому это можно сделать так:
       // driver.navigate().to("http://www.google.com");

       // Находим элемент по атрибуту name
       WebElement element = driver.findElement(By.name("q"));

       // Вводим текст
       element.sendKeys("Selenium");

       // Отправляем форму, при этом дравер сам определит как отправить форму по элементу
       element.submit();

       // Проверяем тайтл страницы
       System.out.println("Page title is: " + driver.getTitle());

       // Страницы гугл динамически отрисовывается с помощью javascript
       // Ждем загрузки страницы с таймаутом в 10 секунд
       (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
           public Boolean apply(WebDriver d) {
               return d.getTitle().toLowerCase().startsWith("selenium");
           }
       });

       // Ожидаем увидеть: "Selenium - Google Search"
       System.out.println("Page title is: " + driver.getTitle());

       // Закрываем браузер
       driver.quit();
	  
	}

}
