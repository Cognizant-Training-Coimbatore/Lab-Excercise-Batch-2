import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://demoworkshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
