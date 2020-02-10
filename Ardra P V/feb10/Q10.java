package webDriverDemo;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		String datafile="file:///D:/test/Q10.csv";
		BufferedReader br=null;
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		 String line="";
		 String cvsSplitBy=",";
		 br= new BufferedReader(new FileReader(datafile));
		 while ((line=br.readLine())!=null) {
			 
			 driver.findElement(By.linkText("Log in")).click();
			 driver.findElement(By.linkText("Register")).click();
			 driver.findElement(By.name("FirstName")).sendKeys(Q10[0]);
			 driver.findElement(By.name("LastName")).sendKeys(Q10[1]);
			 driver.findElement(By.name("Password")).sendKeys(Q10[2]);
			System.out.println(data[0]+data[1]+data[2]);
		 

	}

}
}
