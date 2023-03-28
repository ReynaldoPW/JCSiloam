package com.juaracoding.siloam;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/LoginAdmin.feature",
                "src/main/resources/features/LoginSales.feature",
                "src/main/resources/features/InputDataSales.feature"},
        glue = {"com.juaracoding.siloam"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
