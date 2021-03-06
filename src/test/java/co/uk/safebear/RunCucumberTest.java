package co.uk.safebear;

import  cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-report/cucumber.json"},
        features = "src/test/resources/features/login", //refer to Feature file
        tags = {"@high-impact"}
        )
public class RunCucumberTest {
}
