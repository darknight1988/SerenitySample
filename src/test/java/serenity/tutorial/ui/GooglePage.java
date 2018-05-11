package serenity.tutorial.ui;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://google.com")
public class GooglePage extends PageObject {
	
	@FindBy(id="lst-ib")
	WebElement searchplace;
	
	public void searchKeyWord(String value) {
		searchplace.sendKeys(value);
		searchplace.sendKeys(Keys.ENTER);
	}
	
	

}
