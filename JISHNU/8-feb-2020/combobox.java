import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class combobox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/html/selemium1.html");
		driver.findElement(By.id("text1")).sendKeys("Jishnu");
		Select product= new Select(driver.findElement(By.id("combo1")));
		int total=product.getOptions().size();
		System.out.println(total);
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
