package serentity.tutorial.features.navigation;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class WhenBrowsingToMotoStory {
	
	@Steps
	NavigatingUser mark;
	
	@Managed
	WebDriver browser;
	
	@Before
	
	public void setup()
	{
	
	    browser.manage().window().maximize();
	}
	
	@Test
	public void shouldBeAbleToNavigateToMotor() {
		//Give
		mark.isOnHomePage();
		//When
		mark.navigateToMotorCategory();
		//Then
		mark.shouldSeePageTittleContaining("Electronics, Cars, Fashion, Collectibles, Coupons and More");
	}
}
