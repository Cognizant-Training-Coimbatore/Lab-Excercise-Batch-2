import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://examples.codecharge.com/Store/Default.php ");
	    System.out.println(driver.getTitle());
	    Select op=new Select(driver.findElement(By.name("category_id")));
	    int a=op.getOptions().size();
	    System.out.println("size:"+a);
	    driver.quit();
	    
	}

}
