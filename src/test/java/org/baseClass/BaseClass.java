package org.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.NetworkUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void waitingWeb() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	public static void pageLoadTime() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	public static void screenShot(String screenShotName) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\salma\\eclipse-workspace\\E-Commerce\\ScreenShots\\"+screenShotName+".png");
		FileUtils.copyFile(src, des);

	}
	public static void endBrowser() {
		driver.quit();
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void mouseHover(WebElement movingElement) {
		a = new Actions(driver);
		a.moveToElement(movingElement);
	}
	public static void fillTxt(WebElement element, String txt) {
		element.sendKeys(txt);
	}
	public static void btnClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static String printTxt(List<WebElement> li, int i) {
			return (li.get(i).getText());
//			 li.get(i).getAttribute("innerHTML");
	}
	public static void createExcel(String sheetName, String cellValue, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\salma\\eclipse-workspace\\E-Commerce\\ExcelData\\LazadaData.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet newSheet = workbook.createSheet(sheetName);
		Row newRow = newSheet.createRow(rowNo);
		Cell newCell = newRow.createCell(cellNo);
		newCell.setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
	}
	public static void writeExcel(String sheetName, int rowNo, int cellNo, String cellValue) throws IOException {
		File f = new File("C:\\Users\\salma\\eclipse-workspace\\E-Commerce\\ExcelData\\LazadaData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);

	}

}
