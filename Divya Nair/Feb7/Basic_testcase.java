import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_testcase {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java programs CBE\\Webdriver-Demo\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Open the url "http://www.selenium.dev/"
		driver.get("https://selenium.dev/");
		System.out.println("page Title:"+driver.getTitle());
		System.out.println("page Title:"+driver.getTitle().length());
		//Wait 5 Seconds
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();

	}

}
