import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program6_question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		String s = driver.getTitle();
		System.out.println(s);
		int n = s.length();
		System.out.println("Length of the URL is: "+n);
		System.out.println("The url is : "+driver.getCurrentUrl());
		int a = driver.getCurrentUrl().length();
		System.out.println("Length of the url is :" +a);
		if(n==a)
		{
			System.out.println("Both have the same length");
		}
		else
		{
			System.out.println(driver.getClass());
			String str = driver.getPageSource();
			System.out.println(str);
			System.out.println("The length of page source is :" +str.length());
		}
		driver.quit();
	}

}
