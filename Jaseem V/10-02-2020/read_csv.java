import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read_csv {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(("http://demowebshop.tricentis.com/"));
		String datafile = "E:/Selenium setup files/data.csv";
		BufferedReader br =null;
		String line ="";
		String cvsSplitby =",";
		br = new BufferedReader(new FileReader(datafile));
		while((line = br.readLine())!=null)
		{
			String[] data=line.split(cvsSplitby);
		
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.name("FirstName")).sendKeys(data[0]);
			driver.findElement(By.name("LastName")).sendKeys(data[1]);
			driver.findElement(By.id("Password")).sendKeys(data[2]);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(data[3]);
			
			
		}
	}

}
