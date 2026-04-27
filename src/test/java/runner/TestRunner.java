package runner;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps, hooks")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber.html, json:target/cucumber.json")
public class TestRunner {
}