package sole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Banner {
	private static final String CONTAINER_XPATH = ".//*[@id='fbpromo']";
	private static final String CLOSE_BUTTON_XPATH = ".//*[@id='fbpromo']/div[1]";
	private static final String CLICK_HELPBUY_BUTTON = ".//*[@id='fbpromo']/a/input";
	private static final String BANNER_IMAGE = ".//*[@id='fbpromo']/div[3]/a/img";
	private static final String MAINPAGE_BRANDS = ".//*[@id='hornav']/ul/li[4]/a/span/span";
	private static final String MAINMENU_BRANDS_ADIDAS = ".//*[@id='hornav']/ul/li[4]/div/div/div[2]/div/div/div[2]/ul/li[7]/a/span/span";
	private static final String MAINMENU_HELPBUY_LINK= ".//*[@id='bottom3']/div/div/ul/li[6]/a";
	
	private WebDriver driver;

	public Banner(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getContainer() {
		return driver.findElement(By.xpath(CONTAINER_XPATH));
	}

	public WebElement getContainerClose() {
		return driver.findElement(By.xpath(CLOSE_BUTTON_XPATH));
	}

	public WebElement getHelpBuyButton() {
		return driver.findElement(By.xpath(CLICK_HELPBUY_BUTTON));
	}

	public WebElement getBannerImage() {
		return driver.findElement(By.xpath(BANNER_IMAGE));
	}
	
	public WebElement getMainPageBrands(){
		return driver.findElement(By.xpath(MAINPAGE_BRANDS));
	}
	
	public WebElement getBrandsAdidas(){
		return driver.findElement(By.xpath(MAINMENU_BRANDS_ADIDAS));
	}
	
	public WebElement getMainMenuHelpBuyLink(){
		return driver.findElement(By.xpath(MAINMENU_HELPBUY_LINK));
	}

	public void close() {
		getContainerClose().click();
	}

	public HelpbuyPage clickHelpBuy() {
		getHelpBuyButton().click();
		return new HelpbuyPage(driver);
	}
	
    
	 public String getTitle(){ 
	 return driver.getTitle(); 
	  }
	 
	 public void hover(){
	 Actions actions = new Actions(driver);
	 
	 actions.moveToElement(getMainPageBrands());
	 actions.perform();
	 }
	 
	 public AdidasProducts clickBrandsAdidas(){
		 getBrandsAdidas().click();
		 return new AdidasProducts();
		 	 
	 }
	 
	 public void selectBrand(){
		 Select selectBrand = new Select(driver.findElement(By.xpath(MAINPAGE_BRANDS)));
		 selectBrand.selectByValue("menu-title"); 
	 }
	 
	 public HelpbuyPage getHelpBuyPageFromMainMenu(){
		 getMainMenuHelpBuyLink().click();
		 return new HelpbuyPage(driver);
	 }
	 

	/*
	 * Actions actions = new Actions(driver); public void mouseHover() {
	 * actions.moveToElement(getContainer()).perform(); }
	 */
	 public WebElement pipipi(String pipi){
			return driver.findElement(By.tagName(pipi));
			
		}
}
