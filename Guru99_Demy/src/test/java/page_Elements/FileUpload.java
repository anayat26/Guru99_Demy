package page_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {
	
public WebDriver driver;
	
	public FileUpload(WebDriver driver) {
		this.driver=driver;
	}
	
	By Selenium_click= By.xpath("(//b[@class='caret'])[1]");
	By FileUpload_click= By.xpath("//a[text()='File Upload']");
	By FileUpload_input= By.cssSelector("input[type='file']");
	
	
	public WebElement selenium() {
		return driver.findElement(Selenium_click);
	}
	public WebElement fileUpload() {
		return driver.findElement(FileUpload_click);
	}
	public WebElement brwFile() {
		return driver.findElement(FileUpload_input);
	}
	
	
	

}
