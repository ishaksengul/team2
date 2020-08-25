package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
<<<<<<< HEAD
        tags = "@muska",
        dryRun = false
=======
        tags = "@Osman",
        dryRun = true
>>>>>>> 99837a20cdeaf2a8314e6ccf3a43dfdae59d25ed
)



public class Runner {

}
