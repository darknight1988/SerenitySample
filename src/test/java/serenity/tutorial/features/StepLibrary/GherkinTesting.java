package serenity.tutorial.features.StepLibrary;

import serenity.tutorial.ui.GooglePage;

public class GherkinTesting {

	GooglePage google;
	
	public void openGooglePage() {
		google.open();
		
	}

	public void searchByKeyword(String value) {
		google.searchKeyWord(value);
		
	}

	public void verifyResult() {
		google.getTitle();
		
	}

}
