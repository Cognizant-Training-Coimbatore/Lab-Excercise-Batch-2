import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		String a=driver.getTitle();
		System.out.println(a);
		int b=s.length();
		System.out.println("Length of URL "+b);
		int c=a.length();
		System.out.println("Length of title "+c);
		
		System.out.println("Comparing actual and current url "+s.equals("http://www.flipkart.com/"));
		Object obj=driver.getClass();
		System.out.println("Class name "+obj);
		driver.quit();
		

	}

}
