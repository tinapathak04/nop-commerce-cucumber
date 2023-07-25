package com.nopcommerce.demo.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/nopcommerce/demo/cucumber",
        tags = "@sanity",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"} //for cucumber report
)
public class SanityTestRunner {
}
