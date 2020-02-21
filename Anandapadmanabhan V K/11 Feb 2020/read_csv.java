package basic_commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read_csv {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String datafile = "E:/Shaheen/data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while ((line = br.readLine()) != null)
		{
			String[] data = line.split(cvsSplitBy);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.name("FirstName")).sendKeys(data[0]);
			driver.findElement(By.name("LastName")).sendKeys(data[1]);
			driver.findElement(By.name("Password")).sendKeys(data[2]);
			driver.findElement(By.name("ConfirmPassword")).sendKeys(data[3]);
			//System.out.println(data[0] + data[1] + data[2]);
		}

	}

}