package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_a_link {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/app.html");
		
		WebElement link1=driver.findElement(By.linkText("Google"));
		link1.click();
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
