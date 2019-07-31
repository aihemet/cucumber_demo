package com.cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

    @CucumberOptions(
            plugin = {
                    "pretty",
                   "html:target/cucumber-reports" ,
                   "junit:target/cucumber-reports/Cucumber.xml",
            },

            features = "src/test/resources/features/login.feature",
            glue = "com/cybertek/step_definitions"
            , dryRun = false


    )

public class cukesrunner {





}
