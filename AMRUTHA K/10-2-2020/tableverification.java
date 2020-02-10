import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///D:/amrutha/html/new%20.html");
	    
	    WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
	    List<WebElement>row =table.findElements(By.tagName("tr"));
	    System.out.println(row.size());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   // driver.quit();

	}

}
