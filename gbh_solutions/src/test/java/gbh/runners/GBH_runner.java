package gbh.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features/gbhSolutions.feature",
		glue = "gbh/step/definitions")

public class GBH_runner {

}
