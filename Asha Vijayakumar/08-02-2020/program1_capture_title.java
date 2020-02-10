import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_capture_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/asha/selenium.html");
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
