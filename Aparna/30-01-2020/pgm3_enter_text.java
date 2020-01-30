package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//text to  textbox
public class pgm3_enter_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //which browser to use
				WebDriver driver=new ChromeDriver();     
				driver.get("http://demowebshop.tricentis.com");//open webpage
				WebElement login=driver.findElement(By.linkText("Log in"));  //to give link
				login.click();   //open page  and will click on login on next page
				WebElement email,password;
				email=driver.findElement(By.id("Email"));
				password=driver.findElement(By.id("Password"));
				email.sendKeys("user1");
				password.sendKeys("user1");  //enter text into textbox
				Thread.sleep(5000);  //hold pgm
				driver.quit();
	}

}
