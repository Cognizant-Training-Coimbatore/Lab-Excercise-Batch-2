package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capture_title {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\Admin\\Desktop\\Java programs\\selenium exampls\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/app.html");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
