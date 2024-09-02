package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "E:\\Documents\\Naaptol_Cucumber_Project\\src\\test\\resources\\Naaptol",
glue = "StepsDF"
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
