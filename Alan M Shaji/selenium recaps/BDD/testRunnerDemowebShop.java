import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\MSa\\Eclipse\\BDD_Google_usingCucumber\\Feature\\Demowebshop.feature", glue = {"DemoWebshoPack"})
public class testRunnerDemowebShop {

}
