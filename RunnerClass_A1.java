package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/CreateLead_A1.feature"
			,"src/test/java/features/EditLead_A1.feature"
			,"src/test/java/features/DeleteLead_A1.feature"
			,"src/test/java/features/DuplicateLead_A1.feature"
			,"src/test/java/features/MergeContact_A1.feature"}
		, glue = "steps", monochrome = true, publish = true, dryRun = false)
public class RunnerClass_A1 extends BaseClass {
	

}
