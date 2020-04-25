package test_Script;

import org.testng.annotations.Test;

import page_Elements.FileUpload;
import utitlities.BaseClass;

public class FileUpload_Test extends BaseClass {
	
	
	
@Test(groups = { "smoke"})
public void filUpload() {
	
	FileUpload Filup= new FileUpload (driver);
	
	Filup.selenium().click();
	Filup.fileUpload().click();
	Filup.brwFile().sendKeys("C:\\Users\\jackson\\Desktop\\practice.pdf");
	
	
}
	
	

}
