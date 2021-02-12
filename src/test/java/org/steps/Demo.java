package org.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.lazada.sg/shop-men-shirts/?spm=a2o42.home.cate_9_1.2.654346b5uOdMqw");
		List<WebElement> li = d.findElements(By.xpath("//a[contains(text(),'Shirt')]"));
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}
		
		System.out.println("Done");
	}
}
