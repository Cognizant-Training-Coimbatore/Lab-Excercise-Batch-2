import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_launch_browser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();// for using chrome
		driver.get("http://demowebshop.tricentis.com");// give URL
		String s= driver.getTitle();// to get title
		System.out.println(s);
		driver.quit();
	}

}
