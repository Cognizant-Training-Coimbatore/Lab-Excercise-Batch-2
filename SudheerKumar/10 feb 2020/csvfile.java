import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csvfile {

	public static void main(String[] args) throws Exception {
		String datafile="D/cts/data.csv";
		System.setProperty("webdriver.Chrome.driver","Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		BufferedReader br=null;
		String line=",";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine()) !=null);
		{
			String[] data=line.split(cvsSplitBy);
			driver.get("http://demowebshop.tricentis.com");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.name("FirstName")).sendKeys(data[0]);
			driver.findElement(By.name("LastName")).sendKeys(data[1]);
			driver.findElement(By.name("Password")).sendKeys(data[2]);
			driver.findElement(By.name("ConfirmPassword")).sendKeys(data[3]);
			System.out.println(data[0]+data[1]+data[2]);
			// TODO Auto-generated method stub
		}

	}

}
