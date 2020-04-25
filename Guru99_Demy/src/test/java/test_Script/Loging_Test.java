package test_Script;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import page_Elements.Login;
import utitlities.BaseClass;

public class Loging_Test extends BaseClass {
	
	
	
@Test (priority=1,groups = { "smoke"})
public void verifyLoginValidCred() {
	Login lg=new Login(driver);
	lg.userID().sendKeys("1303");
	lg.password().sendKeys("Guru99");
	lg.loginBtn().click();
	lg.logout().click();
	
	Alert alert= driver.switchTo().alert();
	alert.accept();
}


@Test (enabled=false,priority=2)
public void verifyLoginInValidCred() {
	Login lg=new Login(driver);
	lg.userID().sendKeys("130");
	lg.password().sendKeys("Guru");
	lg.loginBtn().click();
	
	Alert alert= driver.switchTo().alert();
	alert.accept();
}
	


	
	
	

}
