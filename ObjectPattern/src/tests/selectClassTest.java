package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClassTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://thetestroom.com/webapp/");

	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void selectTest() {
		driver.findElement(By.name("nav_adopt")).click();
		Select dropDown = new Select(driver.findElement(By.id("start_select")));
		dropDown.selectByValue("today");
	}
}
