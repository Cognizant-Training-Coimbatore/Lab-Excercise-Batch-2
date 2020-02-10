package basic_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_TestCase {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java_programs\\selenium examples\\chromedriver.exe" );
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "https://www.selenium.dev/"
		driver.get("http://selenium.dev");
		//Wait 5 Seconds
		Thread.sleep(5000);
		//Close the browser
		String title=driver.getTitle();
		System.out.println(title);
		int l=title.length();
		System.out.println(l);
		driver.quit();
		
	}

}
