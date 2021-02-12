package org.pojo;

import java.util.List;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@data-spm-anchor-id='a2o42.home.cate.i0.274246b5XZM2Ir']")
	private WebElement mensFashion;
	
	@FindBy(xpath = "//span[@data-spm-anchor-id='a2o42.home.cate_9.i0.177546b5y9wom8']")
	private WebElement mensClothing;
	
	@FindBy(xpath = "//span[text()='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath = "//a[contains(text(),'Shirt')]") 
	private List<WebElement> product;

	public WebElement getMensFashion() {
		return mensFashion;
	}

	public WebElement getMensClothing() {
		return mensClothing;
	}

	public WebElement getShirts() {
		return shirts;
	}

	public List<WebElement> getProduct() {
		return product;
	}
}
