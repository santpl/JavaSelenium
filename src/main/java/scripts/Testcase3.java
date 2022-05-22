package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchBox(pf.getPropertyFiledata("Typesearch"));
		s.clickSearch();
		
		SeleniumPage sp = new SeleniumPage(driver);
		sp.seleniumCourse();
		
		SeleniumTrainingPage stp = new SeleniumTrainingPage(driver);
		driverUtilities.switchFrames(driver);
		stp.playButton();
		Thread.sleep(3000);
		stp.pauseButton();
		driverUtilities.switchBackFrame(driver);
		stp.AddToWishlist();
		
	}
	

}
