package sole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpbuyPage {
	private static final String NAME_FIELD_HELPBUY = "//input[contains(@class, 'input_deactive')]";
	private static final String MODEL_FIELD_HELPBUY = ".//*[@id='wdform_4_element12']";
	private static final String PHONEMAIL_FIELD_HELPBUY = ".//*[@id='wdform_2_element12']";
	private static final String PRODUCTURL_LFIELD_HELPBUY = ".//*[@id='wdform_3_element12']";
	private static final String ADDITIONAL_FIELD_HELPBUY = ".//*[@id='wdform_9_element12']";
	private static final String COMMENT_FIELD_HELPBUY = ".//*[@id='wdform_10_element12']";
	private static final String CALCULATION_BUTTON_HELPBUY = ".//*[@id='12form_view1']/div[3]/div[2]/div[2]/div/div[2]/button[1]";
	private WebDriver driver;

	public HelpbuyPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNameFieldHelpBuy() {
		return driver.findElement(By.xpath(NAME_FIELD_HELPBUY));
	}

	public WebElement getModelFieldHelpBuy() {
		return driver.findElement(By.xpath(MODEL_FIELD_HELPBUY));
	}

	public WebElement getPhoneMailFieldHelpBuy() {
		return driver.findElement(By.xpath(PHONEMAIL_FIELD_HELPBUY));
	}

	public WebElement getProductFieldHelpBuy() {
		return driver.findElement(By.xpath(PRODUCTURL_LFIELD_HELPBUY));
	}

	public WebElement getAdditionalFieldHelpBuy() {
		return driver.findElement(By.xpath(ADDITIONAL_FIELD_HELPBUY));
	}

	public WebElement getCommentFieldHelpBuy() {
		return driver.findElement(By.xpath(COMMENT_FIELD_HELPBUY));
	}
	
	public WebElement getCalclButtonHelpBuy(){
		return driver.findElement(By.xpath(CALCULATION_BUTTON_HELPBUY));
	}
	
	public void calcclick(){
		getCalclButtonHelpBuy().click();
	}

	public void calculation(String nameenter, String modelenter, String phoneemail, String product, String additional, String comment) {
		getNameFieldHelpBuy().sendKeys(nameenter);
		getModelFieldHelpBuy().sendKeys(modelenter);
		getPhoneMailFieldHelpBuy().sendKeys(phoneemail);
		getProductFieldHelpBuy().sendKeys(product);
		getAdditionalFieldHelpBuy().sendKeys(additional);
		getCommentFieldHelpBuy().sendKeys(comment);
		
	}
	
	
}
