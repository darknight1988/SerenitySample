package serenity.tutorial.features.search;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search/Danh_Gherkin.feature", glue="steps", plugin="pretty")
public class GherkinStory {

}
