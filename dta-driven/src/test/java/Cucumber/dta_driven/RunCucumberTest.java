package Cucumber.dta_driven;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/result.html","json:target/result.json"})
//@CucumberOptions(plugin = {"pretty","json:target/result.json"})
public class RunCucumberTest {

}
