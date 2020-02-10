import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finding_of_coloumns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///D:/amrutha/html/new%20.html");
	    
	    WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
	    List<WebElement>row =table.findElements(By.tagName("td"));
	    System.out.println(row.size());
	    
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
	    

	}

}
