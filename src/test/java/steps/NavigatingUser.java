package steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import serentity.tutorial.ui.CurrentPage;
import serentity.tutorial.ui.EbayHomePage;

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
