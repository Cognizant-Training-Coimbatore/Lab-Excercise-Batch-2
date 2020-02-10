package basicCommands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program14_csv {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		String dataFile = "C:\\Users\\jomon\\Desktop\\CTS\\Training\\Selenium\\data.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";

		br = new BufferedReader(new FileReader(dataFile));
		while((line = br.readLine()) != null)
		{
			String[] data = line.split(csvSplitBy);
			
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.name("FirstName")).sendKeys(data[0]);
			driver.findElement(By.name("LastName")).sendKeys(data[1]);
			driver.findElement(By.name("Password")).sendKeys(data[2]);
			driver.findElement(By.name("ConfirmPassword")).sendKeys(data[3]);
//			System.out.println(data[0] + data[1] + data[2]);
		}
		driver.quit();
	}

}
