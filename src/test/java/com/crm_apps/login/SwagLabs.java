package com.crm_apps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabs {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement login_button = driver.findElement(By.id("login-button"));
		login_button.click();
		
		WebElement Backpack = driver.findElement(By.linkText("Sauce Labs Backpack"));
		Backpack.click();
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart"));
		addtocart.click();
		
		WebElement backtoproducts = driver.findElement(By.id("back-to-products"));
		backtoproducts.click();
		
		WebElement Light = driver.findElement(By.linkText("Sauce Labs Bike Light"));
		Light.click();
		
		WebElement addtocartLight = driver.findElement(By.id("add-to-cart"));
		addtocartLight.click();
		
		WebElement backtoproducts2 = driver.findElement(By.id("back-to-products"));
		backtoproducts2.click();
		
		WebElement TShirt = driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		TShirt.click();
		
		WebElement addtocart3 = driver.findElement(By.id("add-to-cart"));
		addtocart3.click();
		
		WebElement backtoproducts3 = driver.findElement(By.id("back-to-products"));
		backtoproducts3.click();

		WebElement jacket = driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));
		jacket.click();
		
		WebElement addtocart4 = driver.findElement(By.id("add-to-cart"));
		addtocart4.click();

		WebElement backtoproducts4 = driver.findElement(By.id("back-to-products"));
		backtoproducts4.click();

		WebElement onesie = driver.findElement(By.linkText("Sauce Labs Onesie"));
		onesie.click();
		
		WebElement addtocart5 = driver.findElement(By.id("add-to-cart"));
		addtocart5.click();

		WebElement backtoproducts5 = driver.findElement(By.id("back-to-products"));
		backtoproducts5.click();
		
		WebElement redtshirt = driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));
		redtshirt.click();
		
		WebElement addtocart6 = driver.findElement(By.id("add-to-cart"));
		addtocart6.click();
		
		WebElement cart = driver.findElement(By.id("shopping_cart_container"));
		cart.click();
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("sunny");
		
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("kumar");
		
		WebElement zipcode = driver.findElement(By.id("postal-code"));
		zipcode.sendKeys("201301");
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();
		
		

		
	}

}
