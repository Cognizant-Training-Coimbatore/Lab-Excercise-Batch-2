import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program13_read_from_csv_file {

	public static void main(String[] args) throws IOException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		
		String datafile="D/data.csv";
	BufferedReader br=null;
	String line="";
	String cvsSplitBy=",";
	br=new BufferedReader(new FileReader(datafile));
	while((line=br.readLine())!=null)
	{
		String[] data= line.split(cvsSplitBy);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("FirtName")).sendKeys(data[0]);
		driver.findElement(By.name("LastName")).sendKeys(data[1]);
		driver.findElement(By.linkText("Password")).sendKeys(data[2]);
		driver.findElement(By.linkText("ConfirmPassword")).sendKeys(data[3]);
		
	}

	}

}
