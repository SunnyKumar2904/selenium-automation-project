package com.crm_apps.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class createOpportunity {

	public static void main(String[] args) throws InterruptedException {

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

		WebElement createOpportunities = driver.findElement(By.linkText("Create Opportunities"));
		createOpportunities.click();

		// Basic Information
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("New Enterprise Deal");

		WebElement account_name = driver.findElement(By.id("account_name"));
		account_name.sendKeys("Air Safety Inc");
		
		Thread.sleep(3000);

		WebElement date_closed = driver.findElement(By.id("date_closed"));
		date_closed.sendKeys("08/15/2026");

		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("50000");

		Select opportunity_type = new Select(driver.findElement(By.id("opportunity_type")));
		opportunity_type.selectByVisibleText("Existing Business");
		
		Select lead_source = new Select(driver.findElement(By.id("lead_source")));
		lead_source.selectByVisibleText("Cold Call");
		
		WebElement salesStage1 = driver.findElement(By.id("sales_stage"));
		salesStage1.sendKeys("Value Proposition");

		WebElement probability = driver.findElement(By.id("probability"));
		probability.clear();
		probability.sendKeys("50");

		WebElement campaign_name = driver.findElement(By.id("campaign_name"));
		campaign_name.sendKeys("New Campaign");

		WebElement next_step = driver.findElement(By.id("next_step"));
		next_step.sendKeys("Send proposal draft");

		WebElement description = driver.findElement(By.id("description"));
		description.sendKeys("Test opportunity creation for enterprise software suite.");

		// Other Information
		WebElement assigned_user_name = driver.findElement(By.id("assigned_user_name"));
		assigned_user_name.sendKeys("Will Westin");
		
		WebElement save = driver.findElement(By.xpath("(//div//input[@title='Save'])[2]"));
		save.click();
		


	}
}