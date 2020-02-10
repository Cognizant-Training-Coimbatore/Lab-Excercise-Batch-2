import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csv_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String datafile="D:/divya/data.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
				String[] data=line.split(cvsSplitBy);
				driver.get("http://demowebshop.tricentis.com");
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.name("FirstName")).sendKeys(data[0]);
				driver.findElement(By.name("LastName")).sendKeys(data[1]);
				driver.findElement(By.name("Password")).sendKeys(data[2]);
				driver.findElement(By.name("ConfirmPassword")).sendKeys(data[3]);
			
				
		}
		

	}

}
