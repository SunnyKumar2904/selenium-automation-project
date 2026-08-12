package com.crm_apps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		
		WebElement username = driver.findElement(By.id("user_name"));
		username.sendKeys("will");
		
		WebElement password = driver.findElement(By.id("username_password"));
		password.sendKeys("will");
		
		WebElement login = driver.findElement(By.id("bigbutton"));
		login.click();
		
		WebElement CREATE = driver.findElement(By.linkText("CREATE"));
		CREATE.click();
		
		WebElement CreateLeads = driver.findElement(By.linkText("Create Accounts"));
		CreateLeads.click();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Sunny Kumar");
		
		WebElement website = driver.findElement(By.id("website"));
		website.sendKeys("demo.com");
		
		WebElement Accounts0emailAddress0 = driver.findElement(By.id("Accounts0emailAddress0"));
		Accounts0emailAddress0.sendKeys("demo@mail.com");		
		
		WebElement Accounts0emailAddressOptOutFlag0 = driver.findElement(By.id("Accounts0emailAddressOptOutFlag0"));
		Accounts0emailAddressOptOutFlag0.click();
		
		WebElement phone_office = driver.findElement(By.id("phone_office"));
		phone_office.sendKeys("9210185100");
		
		WebElement phone_fax = driver.findElement(By.id("phone_fax"));
		phone_fax.sendKeys("NA");
		
		WebElement billing_address_street = driver.findElement(By.id("billing_address_street"));
		billing_address_street.sendKeys("B-174 sector-55, B-block Noida uttar pradesh");		
		
		WebElement billing_address_city = driver.findElement(By.id("billing_address_city"));
		billing_address_city.sendKeys("Noida");
		
		WebElement billing_address_state = driver.findElement(By.id("billing_address_state"));
		billing_address_state.sendKeys("Uttar Pradesh");
		
		
		
		WebElement billing_address_postalcode = driver.findElement(By.id("billing_address_postalcode"));
		billing_address_postalcode.sendKeys("201301");
		
		WebElement billing_address_country = driver.findElement(By.id("billing_address_country"));
		billing_address_country.sendKeys("India");		
		
		WebElement shipping_address_street = driver.findElement(By.id("shipping_address_street"));
		shipping_address_street.sendKeys("D-122 sector-55, D-block Noida uttar pradesh");
		
		WebElement shipping_address_city = driver.findElement(By.id("shipping_address_city"));
		shipping_address_city.sendKeys("Noida");
		
		WebElement shipping_address_state = driver.findElement(By.id("shipping_address_state"));
		shipping_address_state.sendKeys("Uttar Pradesh");
		
		WebElement shipping_address_postalcode = driver.findElement(By.id("shipping_address_postalcode"));
		shipping_address_postalcode.sendKeys("201301");
		
		WebElement shipping_address_country = driver.findElement(By.id("shipping_address_country"));
		shipping_address_country.sendKeys("India");		
		
		WebElement shipping_checkbox = driver.findElement(By.id("shipping_checkbox"));
		shipping_checkbox.click();
		
		
		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Test status description");		
		
		WebElement assigned_user_name = driver.findElement(By.id("assigned_user_name"));
		assigned_user_name.sendKeys("Will Westin");
		
		WebElement type1 = driver.findElement(By.tagName("select"));
		Select sc = new Select(type1);
		sc.selectByVisibleText("Partner");
		
		Select industry = new Select(driver.findElement(By.id("industry")));
		industry.selectByVisibleText("Biotechnology"); 
		
		
		WebElement annual_revenue = driver.findElement(By.id("annual_revenue"));
		annual_revenue.sendKeys("20000");
		
		WebElement employees = driver.findElement(By.id("employees"));
		employees.sendKeys("Vihaan");		
		
		WebElement parent_name = driver.findElement(By.id("parent_name"));
		parent_name.sendKeys("Air Safety Inc");
		
		WebElement campaign_name = driver.findElement(By.id("campaign_name"));
		campaign_name.sendKeys("New Campaign");
		
		driver.findElement(By.xpath("(//input[@ type='submit'])[2]")).click();
		

	}

}
