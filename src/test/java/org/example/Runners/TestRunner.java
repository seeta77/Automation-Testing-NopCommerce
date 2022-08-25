package org.example.Runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "org/example",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
        },
        dryRun = false,
        tags = "@Smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests{


}
