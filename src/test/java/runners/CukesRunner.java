package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

        },
        features = "src/test/resources/features",
        glue = "stepDefinations",
        dryRun = true


)
public class CukesRunner {
}
