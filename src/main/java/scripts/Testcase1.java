package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearButton();
		s.skillraryDemoAppln();
		
		SkillraryDemoApplication d = new SkillraryDemoApplication(driver);
		driverUtilities.switchTabs(driver);
		driverUtilities.mouseHover(driver, d.getCourseTab());
		d.seleniumtrainingtab();
		
		AddToCart a = new AddToCart(driver);
		driverUtilities.doubleClick(driver, a.getAddbtn());
		a.AddtoCart();
		driverUtilities.alert(driver);
	}

}
