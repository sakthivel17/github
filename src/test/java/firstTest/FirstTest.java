package firstTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	@test
	
	public void validfirsttest() throws IOException {
		
		WebDriver wd= new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement data= wd.findElement(By.name("q"));
		data.sendKeys("chennai");
	    data.submit();
	    File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\gvsak\\eclipse-workspace\\GitHubTest\\ScreenShot\\google.jpg"));
	  
	}

}
