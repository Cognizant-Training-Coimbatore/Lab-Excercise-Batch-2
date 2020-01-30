import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_Page_source {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		int a=url.length();
		int d=title.length();
		System.out.println("length of url :"+a);
		System.out.println("Length of title: "+d);
		System.out.println("Compare given url and current url "+url.equals("https://gmail.com"));
		String source=driver.getPageSource();
		long  b=source.length();
		Object classpage=driver.getClass();
		System.out.println("Name of Class :"+classpage);
		System.out.println( "Length of source code :"+b);
		Thread.sleep(1000);
		driver.quit();
	}

}
