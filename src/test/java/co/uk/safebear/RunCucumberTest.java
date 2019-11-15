package co.uk.safebear;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report/cucumber.json"},
        features = "src/test/resources/feature/searchForCourse", //refer to Feature file
        tags = {"@RunThis"}
        )
public class RunCucumberTest {
}
