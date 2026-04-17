# Playwright Automation Framework

A test automation framework built with:

* Java
* Playwright
* Cucumber
* JUnit 5
* Page Object Model (POM)
* Maven

---

## Project Structure

```bash
src
 ├── test
 │   ├── java
 │   │   ├── hooks
 │   │   ├── pages
 │   │   ├── runner
 │   │   └── steps
 │   └── resources
 │       └── features
```

---

## Technologies Used

* Playwright for browser automation
* Cucumber for BDD
* JUnit 5 for test execution
* Maven for dependency management
* POM for maintainable architecture

---

## Installation

Clone the repository:

```bash
git clone https://github.com/your-username/Playwright.git
```

Go into the project:

```bash
cd Playwright
```

Install dependencies:

```bash
mvn clean install
```

Install Playwright browsers:

```bash
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```

---

## Running Tests

Run all tests:

```bash
mvn test
```

Run from IDE:

* Open `TestRunner.java`
* Run the class directly

---

## Test Runner

Example configuration:

```java
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps, hooks")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber.html")
public class TestRunner {
}
```

---

## Features Example

```gherkin
Feature: Forms

  Scenario: Fill the form
    Given go to site and textbox section "https://demoqa.com/text-box"
    When input the details "John" "Doe" "john@gmail.com" "1234567890" "Address"
    Then verify form submitted
```

---

## Reports

After execution the report is generated in:

```bash
target/cucumber.html
```

---

## Best Practices

* Use Page Object Model
* Reuse locators
* Keep steps readable
* Use hooks for setup and teardown
* Separate test data from test logic

---

## Author
TRAORE
Automation framework created with Playwright + Java+ github + JENKINS CI/CD.
