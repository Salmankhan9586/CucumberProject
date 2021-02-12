package org.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.baseClass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends BaseClass {
	@Before
	public static void browserSteps() {
		browserLaunch();
		maxWindow();
		pageLoadTime();
		waitingWeb();
	}

	@After
	public static void endBrowse() {
		endBrowser();
	}
}
