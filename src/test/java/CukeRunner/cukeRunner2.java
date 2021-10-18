package CukeRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\createOrderTwo" , glue = "RestAssuredStepDefnition",plugin ={"json:target/cucumber-reports/cucumberOne.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class cukeRunner2 extends AbstractTestNGCucumberTests {
} 
