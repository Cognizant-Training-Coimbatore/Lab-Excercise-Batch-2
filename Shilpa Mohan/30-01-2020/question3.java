import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		String s = driver.getTitle();
		System.out.println("Title: " +s);
		System.out.println("Title length: " + s.length());
		
		String url = driver.getCurrentUrl();
		System.out.println("Current url: " +url);
		System.out.println("Current url length: " +url.length());
		
		String urlOriginal="http://google.com";
		System.out.println("Original url: " + urlOriginal);
		System.out.println("Original url length: " + urlOriginal.length());
		
		
	
	}

}
