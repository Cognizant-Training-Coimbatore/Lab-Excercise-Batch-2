import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program4_combobox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("D://amrutha//html//aoo.html");
		    Thread.sleep(2000);
		    Select combo=new Select(driver.findElement(By.id("combo1")));
		    combo.selectByVisibleText("OptionD");	    
		    Thread.sleep(2000);
		    System.out.println(driver.getTitle());
		    driver.quit();
		    
	}

}
