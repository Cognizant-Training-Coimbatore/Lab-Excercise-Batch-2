package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //which browser to use
				WebDriver driver=new ChromeDriver();     
				driver.get("http://jpetstore.cfapps.io/");//open webpage
				WebElement login=driver.findElement(By.linkText("Enter the Store"));  //to give link
				login.click();   //open page  and will click on login on next page
				
				String s=driver.getTitle();
				System.out.println(s);
				driver.quit();
	}

}
