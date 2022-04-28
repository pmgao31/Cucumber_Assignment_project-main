package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/Features", 
		glue={"stepDefinitions"},
//		plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",}, 
		monochrome=true,
		publish = true
//		tags ="@RegressionTest"
		)

public class MyRunner {
	

}
