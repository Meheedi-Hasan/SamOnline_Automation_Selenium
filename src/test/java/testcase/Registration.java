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
	
	public static String url = "https://sam.rultest2.com/";
	public static WebElement element;

	@BeforeClass
	public static void openPage() throws InterruptedException, Exception{
		
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
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
	
	@Test(priority=1)
	public static void Login() throws InterruptedException, Exception{
		
		File src = new File("E:\\Riseup Labs\\Eclipse-Workspace\\Data_Sheet\\Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String u_name = sheet.getRow(0).getCell(0).getStringCellValue();
		String pass = sheet.getRow(0).getCell(2).getStringCellValue();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='stm_lms_login_wrapper']//input[@placeholder='Enter username']")).sendKeys(u_name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='stm_lms_login_wrapper']//input[@placeholder='Enter password']")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		
		System.out.println("Login() method executed successfully");
	}
	@Test(priority=2)
	public static void Course() throws InterruptedException, Exception{
		
		driver.findElement(By.xpath("(//a[contains(text(),'Course')])[3]")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scroll to specific Element
		WebElement e=driver.findElement(By.xpath("//span[normalize-space()='Start course']"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(2000);
		
		// select Start Course
		driver.findElement(By.xpath("//span[normalize-space()='Start course']")).click();
		Thread.sleep(5000);
		
		//Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
		//play video
		driver.findElement(By.xpath("//i[@class='stm_lms_play']")).click();
		Thread.sleep(9000);
		//pause video
//		driver.findElement(By.xpath("//button[@aria-label='pause']")).click();
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class='lnr lnr-heart ']")).click();
		Thread.sleep(3000);
		
		//wishlist
		String actualText = "Favorite courses";
		
		element = driver.findElement(By.xpath("//h3[normalize-space()='Favorite courses']"));
		String testingText = element.getText();
		//System.out.println("Testing Text is "+testingText);
		
		if(testingText.equals(actualText)) {
			AssertJUnit.assertTrue(true);
			System.out.println("Text Matched with the actual text = " + actualText);
		}else {
			AssertJUnit.fail();
			System.out.println("Text didn't Match with the actual text = " + actualText);
		}	
	}
	@Test(priority=3)
	public static void MyCourse() throws InterruptedException, Exception{
		
		// select My Course
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'My Course')]")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[normalize-space()='FAQ']")).click();
		Thread.sleep(3000);
		
		//Checking every dropdown field
		driver.findElement(By.xpath("//a[normalize-space()='When can I start the course?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='I have logged in. How do I take the course?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Can I take more than one module at a time?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='heading3']//a[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Can I use any device to access the course?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Can I print out the course?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='heading6']//a[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='heading7']//a[@role='button']")).click();
		Thread.sleep(3000);
		
		//Select Curriculum
		driver.findElement(By.xpath("//a[normalize-space()='Curriculum']")).click();
		Thread.sleep(3000);
		//Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(3000);
		
		//Select module 1
		driver.findElement(By.xpath("//div[contains(text(),'Module 1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[normalize-space()='MODULE 1: INTORODUCTION']")).click();
		Thread.sleep(3000);
		
		//Test is matching with My course "Module 1"
		String actualText = "Module 1";
		element = driver.findElement(By.xpath("//h1[normalize-space()='Module 1']"));
		String testingText = element.getText();
		//System.out.println("Testing Text is "+testingText);
		
		if(testingText.equals(actualText)) {
			AssertJUnit.assertTrue(true);
			System.out.println("Text Matched with the actual text = " + actualText);
		}else {
			AssertJUnit.fail();
			System.out.println("Text didn't Match with the actual text = " + actualText);
		}
		
		//Scroll to Bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);

		//module 1 video play
		driver.findElement(By.xpath("//i[@class='stm_lms_play']")).click();
		Thread.sleep(9000);
		
		//Select on Question icon 
		driver.findElement(By.xpath("//div[@class='stm-lms-course__sidebar_toggle']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-default btn-icon']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Write your question here']")).sendKeys("Nothing to Test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Add Comment']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='stm-lesson_sidebar__close']//i[@class='lnr lnr-cross']")).click();
		Thread.sleep(3000);
	}

	@Test(priority=4)
	public static void My_profile() throws InterruptedException, Exception{
		
		// select Settings
		driver.findElement(By.xpath("//i[@class='lnr lnr-cog']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[normalize-space()='SomAyan']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Settings']")).click();
		Thread.sleep(3000);
		
		WebElement m = driver.findElement(By.xpath("(//input[@placeholder='Enter your full name'])[1]"));
		m.sendKeys(Keys.CONTROL + "a");
		m.sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("SomAyan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Save changes']")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Downloads\\download.jfif");
//		Thread.sleep(3000);
	}
	
	@AfterClass
	public static void Logout() throws InterruptedException, Exception{
		driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
		Thread.sleep(3000);
		System.out.println("Logout() method executed successfully");
	}

	private static FileInputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}