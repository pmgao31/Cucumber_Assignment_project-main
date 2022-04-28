package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {

	WebDriver driver;
	String product;
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	@FindBy(id="postal-code")
	WebElement zipcode;

	@FindBy(id="continue")
	WebElement continue_btn;

	@FindBy(id="finish")
	WebElement finish_btn;
	
	@FindBy(id="back-to-products")
	WebElement back_home_btn;
	
	@FindBy(xpath="//*[contains(text(),'Backpack')]")
	WebElement ck_product;
	
	public Checkout_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enter_firstname(String f_name) {
		firstname.sendKeys(f_name);
	}

	public void enter_lastname(String l_name) {
		lastname.sendKeys(l_name);
	}
	public void enter_zipcode(String zip) {
		zipcode.sendKeys(zip);
		
	}
	public void click_continue() {
		continue_btn.click();
	}
	public String checkout_product() {
		product=ck_product.getText();
		
		return product;
	}
	public void click_finish() {
		finish_btn.click();
	}
	public void click_back() {
		back_home_btn.click();
	}
}
