package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	public WebElement getCourseTab() {
		return courseTab;
	}
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApplication(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getCoursedd() {
		return coursedd;
	}
	

}
