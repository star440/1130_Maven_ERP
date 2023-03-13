package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features//Login.feature",
                 glue ={"stepDefination"},
                 publish = true,
                 monochrome = true)
public class Addition_check 
{

}
