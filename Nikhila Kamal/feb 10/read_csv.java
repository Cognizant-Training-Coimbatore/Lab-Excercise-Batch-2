package pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read_csv {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\java programs\\\\selenium exampls\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String datafile="D:\\data.csv";
		BufferedReader br=null;
		String line="";
		String csvSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[] data=line.split(csvSplitBy);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.name("FirstName")).sendKeys(data[0]);
			driver.findElement(By.name("LastName")).sendKeys(data[1]);
			driver.findElement(By.name("Password")).sendKeys(data[2]);
			driver.findElement(By.name("ConfirmPassword")).sendKeys(data[3]);
		

	}

}
}
