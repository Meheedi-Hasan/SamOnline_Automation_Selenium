package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static String url = "https://sam.rultest2.com/";
	public static WebDriver driver = null;
	public static WebElement element;
	
    @BeforeSuite
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
    
    @BeforeClass
	public static void openPage() throws InterruptedException, Exception{
		
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
    
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}