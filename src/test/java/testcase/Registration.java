package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Driver;

public class Registration extends Driver {
	
	

	@BeforeClass
	public static void openPage() throws InterruptedException{
		String url = "https://sam.rultest2.com/";
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public static void registration() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span//div[@class='col-md-6']//input[@placeholder='Enter username']")).sendKeys("Ayann");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your E-mail']")).sendKeys("ayan@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span//div[@class='col-md-6']//input[@placeholder='Enter password']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("Ayan Islam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("01732838583");
		Thread.sleep(3000);
		
		WebElement dropDown = driver.findElement(By.name("Gender"));
		Select se = new Select(dropDown);
		se.selectByValue("male");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("25");
		Thread.sleep(3000);
		
		WebElement Dg = driver.findElement(By.name("Designation"));
		Select Dg_Se = new Select(Dg);
		Dg_Se.selectByValue("_others_");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter institution name']")).sendKeys("RiseupLabs");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		
		
	}
	
	
}