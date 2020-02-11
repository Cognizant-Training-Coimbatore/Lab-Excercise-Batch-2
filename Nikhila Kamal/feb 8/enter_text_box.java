package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enter_text_box {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/app.html");
		
		driver.findElement(By.id("txt1")).sendKeys("kavery");
		Thread.sleep(5000);
		driver.quit();
	}

}
