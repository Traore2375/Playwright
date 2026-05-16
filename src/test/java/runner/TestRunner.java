package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")

@ConfigurationParameter(
        key = "cucumber.glue",
        value = "steps, hooks"
)

@ConfigurationParameter(
        key = "cucumber.filter.tags",
        value = "@select"
)

@ConfigurationParameter(
        key = "cucumber.plugin",
        value = "pretty, html:target/cucumber-reports/cucumber.html, json:target/cucumber-reports/cucumber.json"
)

public class TestRunner {
}