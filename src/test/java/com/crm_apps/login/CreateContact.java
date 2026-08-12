package com.crm_apps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateContact {

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

		WebElement createContact = driver.findElement(By.linkText("Create Contacts"));
		createContact.click();

		// Overview Fields
		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Sunny");

		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("Kumar");

		WebElement phone_work = driver.findElement(By.id("phone_work"));
		phone_work.sendKeys("(691) 536-1933");

		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("9876543210");

		WebElement title = driver.findElement(By.id("title"));
		title.sendKeys("QA Lead");

		WebElement department = driver.findElement(By.id("department"));
		department.sendKeys("Quality Assurance");

		WebElement account_name = driver.findElement(By.id("account_name"));
		account_name.sendKeys("Air Safety Inc");

		WebElement phone_fax = driver.findElement(By.id("phone_fax"));
		phone_fax.sendKeys("NA");

		WebElement Contacts0emailAddress0 = driver.findElement(By.id("Contacts0emailAddress0"));
		Contacts0emailAddress0.sendKeys("demo@mail.com");

		WebElement Contacts0emailAddressOptOutFlag0 = driver.findElement(By.id("Contacts0emailAddressOptOutFlag0"));
		Contacts0emailAddressOptOutFlag0.click();

		// Primary Address
		WebElement primary_address_street = driver.findElement(By.id("primary_address_street"));
		primary_address_street.sendKeys("111 Silicon Valley Road");

		WebElement primary_address_city = driver.findElement(By.id("primary_address_city"));
		primary_address_city.sendKeys("Denver");

		WebElement primary_address_state = driver.findElement(By.id("primary_address_state"));
		primary_address_state.sendKeys("NY");

		WebElement primary_address_postalcode = driver.findElement(By.id("primary_address_postalcode"));
		primary_address_postalcode.sendKeys("62832");

		WebElement primary_address_country = driver.findElement(By.id("primary_address_country"));
		primary_address_country.sendKeys("USA");

		// Other Address
		WebElement alt_address_street = driver.findElement(By.id("alt_address_street"));
		alt_address_street.sendKeys("D-122 sector-55, D-block Noida uttar pradesh");

		WebElement alt_address_city = driver.findElement(By.id("alt_address_city"));
		alt_address_city.sendKeys("Noida");

		WebElement alt_address_state = driver.findElement(By.id("alt_address_state"));
		alt_address_state.sendKeys("Uttar Pradesh");

		WebElement alt_address_postalcode = driver.findElement(By.id("alt_address_postalcode"));
		alt_address_postalcode.sendKeys("201301");

		WebElement alt_address_country = driver.findElement(By.id("alt_address_country"));
		alt_address_country.sendKeys("India");

		WebElement alt_checkbox = driver.findElement(By.id("alt_checkbox"));
		alt_checkbox.click();

		// Description & User Assignment
		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Test contact creation description");

		WebElement assigned_user_name = driver.findElement(By.id("assigned_user_name"));
		assigned_user_name.sendKeys("Will Westin");

		// More Information Fields
		WebElement report_to_name = driver.findElement(By.id("report_to_name"));
		report_to_name.sendKeys("Willy Soo");

		WebElement campaign_name = driver.findElement(By.id("campaign_name"));
		campaign_name.sendKeys("New Campaign");
		
		driver.findElement(By.xpath("(//input[@ value='Save'])[2]")).click();


		
	}
}