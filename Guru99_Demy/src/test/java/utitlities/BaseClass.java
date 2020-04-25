package utitlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page_Elements.Login;

public class BaseClass {
	
	protected WebDriver driver;
//	public Read_Config pro=new Read_Config();
//	 public String UserID =     Read_Config.userID();
//	 public String Password =     Read_Config.password();
	
	@Parameters ("browser")
	@BeforeClass
	public void openBrw(String brw) {
		
		if(brw.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	      driver=new ChromeDriver();
		}
		else if(brw.contains("firfox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		      driver=new FirefoxDriver();
		}
		
		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	
		
	
	
@AfterClass
public void closeBrw() throws Exception {
	Thread.sleep(4000);
	driver.quit();
}
	
	

}
