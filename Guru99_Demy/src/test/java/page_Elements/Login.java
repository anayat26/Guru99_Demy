package page_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	
	public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	By UserID_input=By.name("uid");
	By Password_input=By.name("password");
	By LoginBtn_click= By.name("btnLogin");
	By Logout_click= By.xpath("//a[text()='Log out']");
	
	
	public WebElement userID() {
		return driver.findElement(UserID_input);
	}
	public WebElement password() {
		return driver.findElement(Password_input);
	}
	public WebElement loginBtn() {
		return driver.findElement(LoginBtn_click);
	}
	public WebElement logout() {
		return driver.findElement(Logout_click);
	}
	

}
