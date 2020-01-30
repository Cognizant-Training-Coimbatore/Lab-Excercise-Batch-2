import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program6q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String s2 = driver.getCurrentUrl();
		
		System.out.println(s2);

		if("http://google.com".equals(s2)) {
			
		
			System.out.println("url are same");
	} else {
		System.out.println("not same  ");
	}
		System.out.println("length of url : " + s2.length());
		String s = driver.getTitle();
		System.out.println("title:" + s);
		driver.quit();
		System.out.println("title length :" + s.length());
		
		String s3 = driver.getPageSource();
		System.out.println(s3);
		
		
		
		
		
		
	}

}
