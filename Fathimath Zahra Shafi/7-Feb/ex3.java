import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		
		String expected="Online Bookstore";
		System.out.println(driver.getTitle());
		if(expected.equals(driver.getTitle()))
			System.out.println("title matches");
		else
			System.out.println("title does not match");
		
		Select op=new Select(driver.findElement(By.name("category_id")));
	    System.out.println(op.getOptions().size());
		 
		 Thread.sleep(5000);
		 
		 driver.quit();
		

	}

}
