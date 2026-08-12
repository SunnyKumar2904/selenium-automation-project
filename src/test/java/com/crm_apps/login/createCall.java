package com.crm_apps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class createCall {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");

		// Login
		WebElement username = driver.findElement(By.cssSelector("input#user_name"));
		username.sendKeys("will");

		WebElement password = driver.findElement(By.cssSelector("input#username_password"));
		password.sendKeys("will");

		WebElement login = driver.findElement(By.cssSelector("input#bigbutton"));
		login.click();

		// Navigation links
		WebElement CREATE = driver.findElement(By.linkText("CREATE"));
		CREATE.click();

		WebElement createCalls = driver.findElement(By.linkText("Create Calls"));
		createCalls.click();

		// Overview Fields
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Client Alignment Call");

		Select direction = new Select(driver.findElement(By.id("direction")));
		direction.selectByVisibleText("Inbound");

		Select status = new Select(driver.findElement(By.id("status")));
		status.selectByVisibleText("Held");

		// Date & Time
		WebElement date_start = driver.findElement(By.id("date_start_date"));
		date_start.clear();
		date_start.sendKeys("07/30/2026");

		Select hours = new Select(driver.findElement(By.id("date_start_hours")));
		hours.selectByVisibleText("11");

		Select minutes = new Select(driver.findElement(By.id("date_start_minutes")));
		minutes.selectByVisibleText("45");

		// Related To
		Select parent_type = new Select(driver.findElement(By.id("parent_type")));
		parent_type.selectByVisibleText("Account");

		WebElement parent_name = driver.findElement(By.id("parent_name"));
		parent_name.sendKeys("Air Safety Inc");

		// Duration
		WebElement duration_hours = driver.findElement(By.id("duration_hours"));
		duration_hours.clear();
		duration_hours.sendKeys("10");

		Select duration_minutes = new Select(driver.findElement(By.id("duration_minutes")));
		duration_minutes.selectByVisibleText("30");

		// Description & Assigned User
		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Discussion regarding Q3 service contract renewal.");

		//WebElement assigned_user_name = driver.findElement(By.id("assigned_user_name"));
		//assigned_user_name.sendKeys("Will Westin");
		
		driver.findElement(By.id("invitees_search")).click();
		
		/*WebElement firstname1 = driver.findElement(By.id("search_first_name"));
		firstname1.sendKeys("Vihaan");

		WebElement lastname1 = driver.findElement(By.id("search_last_name"));
		lastname1.sendKeys("Chaudhary");

		WebElement search_email = driver.findElement(By.id("search_email"));
		search_email.sendKeys("demo@mail.com");
		
		WebElement create_invitee_as_contact = driver.findElement(By.id("create_invitee_as_contact"));
		create_invitee_as_contact.click();
		
		WebElement createinviteebtn = driver.findElement(By.id("create-invitee-btn"));
		createinviteebtn.click();*/

		// Save Action
		
		driver.findElement(By.xpath("(//input[@id=\"SAVE_SEND_HEADER\"])[2]")).click();
		
		
	}
}