package bdd_pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features="Features",glue="feb20",format="pretty")
public class TestRunner {

}
