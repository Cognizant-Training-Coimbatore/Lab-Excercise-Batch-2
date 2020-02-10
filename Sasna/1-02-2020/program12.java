import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/sample.html");
		Select product = 
				new Select(driver.findElement(By.xpath("/html/body/select")));
		product.selectByVisibleText("Mango");
		
		int total = product.getOptions().size();
		System.out.println(total);
		Thread.sleep(5000);
		
		WebElement link = 
			driver.findElement(By.linkText("click here"));
		int total1 = ((Select) link).getOptions().size();
		System.out.println(total1);
		Thread.sleep(5000);
		driver.quit(); 
	}

}
