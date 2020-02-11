package day3exercise;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe") ;     
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/imghp?hl=en&tab=ri&ogbl");
		
		
		String filename="Sample_screen";
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\amrutha\\screenshots\\"+filename+".png"));
		
	}

}
