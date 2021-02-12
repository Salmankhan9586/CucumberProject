package org.steps;

import java.io.IOException;

import org.baseClass.BaseClass;
import org.pojo.PojoClass;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass  {

	public static PojoClass pj;

	@Given("User should hit the link")
	public void user_should_hit_the_link() throws IOException  {
		urlLaunch("https://www.lazada.sg/");
		screenShot("URLLaunch");
	}

	@When("User will move to Mens Fashion")
	public void user_will_move_to_Mens_Fashion() throws IOException{
		pj = new PojoClass();
		mouseHover(pj.getMensFashion());
		screenShot("mensFashionHover");
	}

	@When("User will move to Mens Clothing")
	public void user_will_move_to_Mens_Clothing() throws IOException {
		mouseHover(pj.getMensClothing());
		screenShot("mensClothingHover");
	}

	@When("User will click Shirts option")
	public void user_will_click_Shirts_option() throws IOException {
		btnClick(pj.getShirts());
		screenShot("ShirtsClick");
	}

	@Then("User will genarate all the product names")
	public void user_will_genarate_all_the_product_names() throws IOException {
		int j = 0;
		createExcel("Product Details", "Shirt List", 0, 0);
		for (int i = 1; i < pj.getProduct().size(); i++) {
			writeExcel("Product Details", i, j, printTxt(pj.getProduct(), i));
			screenShot("excelDataWritten");
		}
        System.out.println("Done!");
	}

}
