package sole;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class WebDriverUtils {
	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver){
		this.driver=driver;
	}
	
	public void takeScreenShot(String screenShotName) throws IOException {
		File ScreenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShotFile, new File("c:\\webdriverScrennShot\\" + screenShotName + ".png"));
	}
}
