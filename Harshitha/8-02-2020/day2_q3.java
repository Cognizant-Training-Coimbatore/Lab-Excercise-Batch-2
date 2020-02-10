import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		if(driver.getTitle().equalsIgnoreCase("Online Bookstore"))
			System.out.println("Title verified");
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		int size=combo1.getOptions().size();
		System.out.println("Total values from Search Product combo box:"+size);
		driver.quit();
	}

}
