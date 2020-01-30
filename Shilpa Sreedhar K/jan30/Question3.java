import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		String title=driver.getTitle();
		int len=title.length();
		System.out.println("Page title is: " +title);
		System.out.println("Title length is: " +len);
		String url2=driver.getCurrentUrl();
		if(url2.equals("http://gmail.com"))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are different");
		}
		String str = driver.getPageSource();
		System.out.println(str);
		double len1=str.length();
		System.out.println("Pagesource length is: " +len1);		
		driver.quit();

	}

}
