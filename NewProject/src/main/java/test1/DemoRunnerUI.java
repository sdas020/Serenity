package test1;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java",glue={"test1"},tags={"@GUItestingIntro"},
plugin={"pretty","html:cucumberReport/cucumber-html-report","json:cucumberReport/cucumber-report.json"})

public class DemoRunnerUI {	
	

}
