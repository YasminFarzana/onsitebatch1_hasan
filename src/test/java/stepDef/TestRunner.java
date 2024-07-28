package stepDef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/java/features", // path of your all feature files means Test case
        glue = "stepDef", // All feature are automated or scripted under the stepDef package
        plugin= {"json:target.cucumber.json"} // this is for making this report
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
