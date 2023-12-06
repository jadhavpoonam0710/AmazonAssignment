package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(		
		features= {"Allfeature"},
		glue= {"StepDefinition"},
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
