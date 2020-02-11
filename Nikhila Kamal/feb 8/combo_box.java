package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class combo_box {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/app.html");
		Select box=new Select(driver.findElement(By.id("combo1")));
		box.selectByVisibleText("D");
		Thread.sleep(5000);
		
	}

}
