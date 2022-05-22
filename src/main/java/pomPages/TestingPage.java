package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrain;
	
	@FindBy(id="mycart")
	private WebElement addtocart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getSeleniumTrain() {
		seleniumtrain.click();
	}
	
	
	public WebElement getSeleniumtrain() {
		return seleniumtrain;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void Facebook() {
		facebook.click();
	}

}
