package pomPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SkillraryLoginPage {
	
	//public PropertyFile prop = new PropertyFile();
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchbx;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchclk;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void gearButton()
	{
		gearbtn.click();
	}
	
	public void skillraryDemoAppln() {
		skillrarydemoapp.click();
	}
	
	public void searchBox(String Typesearch) {
		searchbx.sendKeys(Typesearch);
	}
	
	public void clickSearch()
	{
		searchclk.click();
	}
}
