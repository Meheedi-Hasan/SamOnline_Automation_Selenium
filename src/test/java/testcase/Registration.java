package testcase;
import java.io.File;
import java.io.FileInputStream;  
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.Driver;

public class Registration extends Driver {
	
	public static WebElement element;
	
	/*
	@Test(priority=1)
	public static void registration() throws InterruptedException, Exception{
		
		File src = new File("E:\\Riseup Labs\\Eclipse-Workspace\\Data_Sheet\\Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String u_name = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(u_name);
		String email = sheet.getRow(0).getCell(1).getStringCellValue();
		String pass = sheet.getRow(0).getCell(2).getStringCellValue();
		String con_pass = sheet.getRow(0).getCell(2).getStringCellValue();
		String FullName = sheet.getRow(0).getCell(3).getStringCellValue();
		int phone1 = (int) sheet.getRow(0).getCell(4).getNumericCellValue();
		String phone = String.valueOf(phone1);
		
		int age1 = (int) sheet.getRow(0).getCell(5).getNumericCellValue();
		String age = String.valueOf(age1);
		
		String Inst = sheet.getRow(0).getCell(6).getStringCellValue();
		
		xsf.close();
		
	
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span//div[@class='col-md-6']//input[@placeholder='Enter username']")).sendKeys(u_name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your E-mail']")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span//div[@class='col-md-6']//input[@placeholder='Enter password']")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys(con_pass);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(FullName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("0"+phone);
		Thread.sleep(3000);
		
		WebElement dropDown = driver.findElement(By.name("Gender"));
		Select se = new Select(dropDown);
		se.selectByValue("male");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys(age);
		Thread.sleep(3000);
		
		WebElement Dg = driver.findElement(By.name("Designation"));
		Select Dg_Se = new Select(Dg);
		Dg_Se.selectByValue("_others_");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter institution name']")).sendKeys(Inst);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		
	
	}
		*/
	
	

	private static FileInputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}