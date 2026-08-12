package com.crm_apps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class createLead {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://demo.suiteondemand.com/index.php?action=Login&module=Users");
		
		WebElement username = driver.findElement(By.id("user_name"));
		username.sendKeys("will");
		
		WebElement password = driver.findElement(By.id("username_password"));
		password.sendKeys("will");
		
		WebElement login = driver.findElement(By.id("bigbutton"));
		login.click();
		
		WebElement CREATE = driver.findElement(By.linkText("CREATE"));
		CREATE.click();
		
		WebElement CreateLeads = driver.findElement(By.linkText("Create Leads"));
		CreateLeads.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Sunny");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Kumar");		
		
		WebElement title = driver.findElement(By.id("title"));
		title.sendKeys("SDET");
		
		WebElement department = driver.findElement(By.id("department"));
		department.sendKeys("Testing");
		
		WebElement EditView_account_name = driver.findElement(By.id("EditView_account_name"));
		EditView_account_name.sendKeys("Test");
		
		WebElement phone_work = driver.findElement(By.id("phone_work"));
		phone_work.sendKeys("8510092191");		
		
		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("9711915134");
		
		WebElement phone_fax = driver.findElement(By.id("phone_fax"));
		phone_fax.sendKeys("NA");
		
		WebElement website = driver.findElement(By.id("website"));
		website.sendKeys("google.com");
		
		WebElement primary_address_street = driver.findElement(By.id("primary_address_street"));
		primary_address_street.sendKeys("B-174 sector-55, B-block Noida uttar pradesh");		
		
		WebElement primary_address_city = driver.findElement(By.id("primary_address_city"));
		primary_address_city.sendKeys("Noida");
		
		WebElement primary_address_state = driver.findElement(By.id("primary_address_state"));
		primary_address_state.sendKeys("Uttar Pradesh");
		
		WebElement primary_address_postalcode = driver.findElement(By.id("primary_address_postalcode"));
		primary_address_postalcode.sendKeys("201301");
		
		WebElement primary_address_country = driver.findElement(By.id("primary_address_country"));
		primary_address_country.sendKeys("India");		
		
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
		
		WebElement Leads0emailAddress0 = driver.findElement(By.id("Leads0emailAddress0"));
		Leads0emailAddress0.sendKeys("Sunnyrock2904@gmail.com");
		
		WebElement Leads0emailAddressOptOutFlag0 = driver.findElement(By.id("Leads0emailAddressOptOutFlag0"));
		Leads0emailAddressOptOutFlag0.click();
		
		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Test description");
		
		WebElement status_description = driver.findElement(By.id("status_description"));
		status_description.sendKeys("Test status description");		
		
		WebElement lead_source_description = driver.findElement(By.id("lead_source_description"));
		lead_source_description.sendKeys("Test lead source description");
		
		WebElement opportunity_amount = driver.findElement(By.id("opportunity_amount"));
		opportunity_amount.sendKeys("20000");
		
		WebElement refered_by = driver.findElement(By.id("refered_by"));
		refered_by.sendKeys("Vihaan");		
		
		WebElement campaign_name = driver.findElement(By.id("campaign_name"));
		campaign_name.sendKeys("New campaign");
		
		driver.findElement(By.xpath("(//input[@value=\"Save\"])[2]")).click();

		
		
	}
	
	

}
