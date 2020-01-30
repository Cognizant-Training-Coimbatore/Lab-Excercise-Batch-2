import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver"," chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	String actual_url="www.google.com";
	String s=driver.getTitle();
	System.out.println(s);
	int l=s.length();
	System.out.println("Title length  :"+s);
	String current_url=driver.getCurrentUrl();
	System.out.println("current url  :"+current_url);
    int url_length=current_url.length();
    System.out.println("url length  :"+url_length);
    if (actual_url.contentEquals(current_url))
    {
    	System.out.println("actual url and current url are same");
    }
    else
    {
    	System.out.println("actual url and current url are different");
    }
    Class<? extends WebDriver> page_class=driver.getClass();
    System.out.println("page class  :"+page_class);
    String source=driver.getPageSource();
    System.out.println("page sourse  :"+source);
    int source_length=source.length();
    System.out.println("Source length  :"+source_length);
    driver.quit();
	}

}
