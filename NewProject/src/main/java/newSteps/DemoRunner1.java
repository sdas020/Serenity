package newSteps;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java",
glue={"test"},
tags={"@GUItestingIntro"},
plugin={"pretty","html:cucumberReport/cucumber-html-report","json:cucumberReport/cucumber-report.json"})

public class DemoRunner1 {

	
	///Test/src/main/java/test/Cab_book_Step_definition.java

}
