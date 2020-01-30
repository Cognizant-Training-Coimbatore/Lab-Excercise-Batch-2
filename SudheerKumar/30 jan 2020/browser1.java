import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://gmail.com");
		 String title=driver.getTitle();
		    int len=title.length();
		    System.out.println("page title is:"+title);
		    System.out.println("title length is:"+len);
	    String url1="https://gmail.com";
	    String url2=driver.getCurrentUrl();
	    if(url2.equals("https://gmail.com"))
	    {
	    	System.out.println("both area same");
	    }
	    else
	    {
	    	System.out.println("both are different");
	    }
	    String str=driver.getPageSource();
	    System.out.println(str);
	    
	   
	    
	}

}
