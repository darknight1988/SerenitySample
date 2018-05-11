package serenity.tutorial.features.StepLibrary;

import net.thucydides.core.annotations.Step;
import serenity.tutorial.ui.GooglePage;

public class UserGoogle {

	GooglePage google;

	@Step
	public void openBrowser() {
		google.open();
	}

	@Step
	public void searchWithKeyword(String value) {
		google.searchKeyWord(value);

	}

	@Step
	public void verifyTheResult() {
		google.getTitle();

	}

}
