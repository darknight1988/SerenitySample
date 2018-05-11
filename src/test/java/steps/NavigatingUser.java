package steps;

import org.junit.Assert;
import org.junit.Ignore;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import serenity.tutorial.ui.CurrentPage;
import serenity.tutorial.ui.EbayHomePage;

public class NavigatingUser {

	EbayHomePage ebayHomePage;
	CurrentPage currentPage;

	@Step
	public void isOnHomePage() {
		ebayHomePage.open();
	}

	@Step
	
	public void shouldSeePageTittleContaining(String expectedTitle) {
		String test = currentPage.getTitle();
		System.out.println(test);
		// Assert.assertEquals(currentPage.getTitle(), expectedTitle);
	}

	@Step
	public void navigateToMotorCategory() {
		// TODO Auto-generated method stub

	}

}
