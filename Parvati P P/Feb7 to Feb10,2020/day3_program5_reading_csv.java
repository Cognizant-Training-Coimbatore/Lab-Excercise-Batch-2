package batch2Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_program5_reading_csv {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		
		String datafile="D:\\data.csv";
	BufferedReader br=null;
	String line="";
	String cvsSplitBy=",";
	br=new BufferedReader(new FileReader(datafile));
	while((line=br.readLine())!=null)
	{
		String[] data= line.split(cvsSplitBy);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(data[0]);
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(data[1]);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(data[2]);
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(data[3]);
		Thread.sleep(3000);
		break;
		

	}
	driver.quit();

}}
