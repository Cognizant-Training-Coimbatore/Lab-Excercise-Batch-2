import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_launch_browser 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//which browser to use
		WebDriver driver = new ChromeDriver();//webdriver obj
		driver.get("http://demowebshop.tricentis.com");//to launch the wegpage
		String s = driver.getTitle();//to get title
		System.out.println(s);
		driver.quit();
	}

}
