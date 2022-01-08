package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src\\main\\resources\\FinalAssignment.feature",
        glue = "TestCase"
)

public class RunCukeTest {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass(){

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(groups = "cucumber",description = "Runs Cucumber Scenarios")
    public void  scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature){
        testNGCucumberRunner.runScenario(pickle.getPickle());
    }

    @AfterClass(alwaysRun = true)
    public void teardownClass(){
        testNGCucumberRunner.finish();
    }

}
