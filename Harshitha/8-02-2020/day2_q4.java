import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		if(driver.getTitle().equalsIgnoreCase("Online Bookstore"))
		System.out.println("Title verified");
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		driver.findElement(By.linkText("Web Database Development")).click();
		String s=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(Integer.parseInt(s));
		driver.findElement(By.name("Insert1")).click();
		if(driver.findElement(By.name("Delete1_1")).isSelected())
			System.out.println("Delete checkbox is ON");
		else
			System.out.println("Delete checkbox is OFf");
		Thread.sleep(2000);
		driver.quit();
	}

}