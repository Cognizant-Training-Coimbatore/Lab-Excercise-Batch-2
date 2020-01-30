import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_launch_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which driver to use
		WebDriver driver=new ChromeDriver();//using chrome driver 
		driver.get("http://demowebshop.tricentis.com");//get the page
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
