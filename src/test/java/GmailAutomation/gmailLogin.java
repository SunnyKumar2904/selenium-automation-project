package GmailAutomation;

import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class gmailLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		int min = 2000;
		int max = 3000;
		
		Random ranNum = new Random();
		int randomNum = ranNum.nextInt(min, max);

		
		Thread.sleep(randomNum);
		
		driver.get("https://www.google.com/");
		Thread.sleep(randomNum);

		
		WebElement googleSearch = driver.findElement(By.id("APjFqb"));
		googleSearch.sendKeys("create gmail account");
		Thread.sleep(randomNum);
		googleSearch.submit();
		
		Thread.sleep(randomNum);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).submit();
		
		

		
		
		
		
		
	}

}
