package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        features = {"ssrc/test/resource/features"},
        glue = {"src/test/java/stepdefinations"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber"}
)

public class TestRunner extends AbstractTestNGCucumberTests {



}
