package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearButton();
		s.skillraryDemoAppln();
		
		SkillraryDemoApplication d = new SkillraryDemoApplication(driver);
		driverUtilities.switchTabs(driver);
		driverUtilities.dropdown(d.getCoursedd(), pf.getPropertyFiledata("coursedd"));
		
		TestingPage t = new TestingPage(driver);
		driverUtilities.dragDrop(driver, t.getSeleniumtrain(), t.getAddtocart());
		Thread.sleep(3000);
		
		Point fb = t.getFacebook().getLocation();
		int x = fb.getX();
		int y = fb.getY();
		driverUtilities.scrollBar(driver, x, y);
		t.Facebook();
		
	}

}
