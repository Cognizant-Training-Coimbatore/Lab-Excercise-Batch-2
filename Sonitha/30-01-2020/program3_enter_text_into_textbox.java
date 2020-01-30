import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_enter_text_into_textbox {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//which browser to use
		WebDriver driver = new ChromeDriver();//webdriver obj
		
		driver.get("http://demowebshop.tricentis.com");//to launch the wegpage
		
		WebElement login = driver.findElement(By.linkText("Log in"));//to find the element
		//By.linkText:to click the textbox
		login.click();
		
		WebElement email,password;
		email = driver.findElement(By.id("Email"));//to find the email element
		password = driver.findElement(By.id("Password"));
		email.sendKeys("user1");
		password.sendKeys("user1");//to enter the text in textbox
		
		
		Thread.sleep(5000);//it will hold the program for 5sec
		
		driver.quit();//to close the webdriver
	}

}
