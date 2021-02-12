package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.steps",
dryRun=false, plugin= {"html:Reports","json:Reports//Lazada.json"})
public class TestRunnerClass {

}



