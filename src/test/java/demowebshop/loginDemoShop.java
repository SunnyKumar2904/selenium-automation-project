package demowebshop;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class loginDemoShop {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Random ranNum = new Random();
		int randomNum = ranNum.nextInt(1000);
		
		String randomGmail = ("random" + randomNum + "@gmail.com");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sunny");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys(randomGmail);
		
		driver.findElement(By.id("Password")).sendKeys("qwerty123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("qwerty123");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("laptop");
		//Select laptop = new Select(driver.findElement(By.id(null))) 
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href=\"/141-inch-laptop\"]")).click();
		driver.findElement(By.id("add-to-cart-button-31")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='topcartlink']")).click();
		
		
		Select country = new Select(driver.findElement(By.id("CountryId")));
		country.selectByValue("1");
		
		Thread.sleep(3000);
		
		Select StateProvinceId = new Select(driver.findElement(By.id("StateProvinceId")));
		StateProvinceId.selectByVisibleText("Arizona");
		
		driver.findElement(By.id("ZipPostalCode")).sendKeys("20130");
		driver.findElement(By.xpath("//input[@ name=\"estimateshipping\"]")).click();
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Demo");
		Select billcountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		billcountry.selectByVisibleText("United States");
		
		Thread.sleep(3000);
		
		Select billstate = new Select(driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
		billstate.selectByVisibleText("Arizona");
		
		WebElement primary_address_city = driver.findElement(By.id("BillingNewAddress_City"));
		primary_address_city.sendKeys("Noida");
		
		WebElement primary_address_postalcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		primary_address_postalcode.sendKeys("201301");
		WebElement alt_address_street = driver.findElement(By.id("BillingNewAddress_Address1"));
		alt_address_street.sendKeys("D-122 sector-55, D-block Noida uttar pradesh");
		
		WebElement phone_work = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		phone_work.sendKeys("8510092191");		

		driver.findElement(By.xpath("//input[@onclick=\"Billing.save()\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick=\"Shipping.save()\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick=\"ShippingMethod.save()\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick=\"PaymentMethod.save()\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick=\"PaymentInfo.save()\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here for order details.")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='PDF Invoice']")).click();

		
	}

}
