package selenium_examples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\javaprograms\\selenium_examples\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/app.html");
		
	List<WebElement> radio1=driver.findElements(By.name("gender"));
	System.out.println(radio1.get(0).isSelected());
	System.out.println(radio1.get(1).isSelected());
		Thread.sleep(5000);
		radio1.get(0).click();
		System.out.println(radio1.get(0).isSelected());
		driver.quit();
		

	}

}
