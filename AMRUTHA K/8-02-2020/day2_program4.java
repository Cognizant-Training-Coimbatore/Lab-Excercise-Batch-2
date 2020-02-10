import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_program4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://examples.codecharge.com/Store/Default.php ");
	    System.out.println(driver.getTitle());
	    Select list=new Select(driver.findElement(By.name("category_id")));
	    list.selectByVisibleText("Databases");
	    Thread.sleep(2000);
	    driver.findElement(By.name("DoSearch")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Web Database Development")).click();
	String s= driver.findElement(By.name("quantity")).getAttribute("value");
	System.out.println(s);
	driver.findElement(By.name("Insert1")).click();
	Thread.sleep(2000);
	WebElement del=driver.findElement(By.name("Delete1_1"));
	boolean aa=del.isSelected();
	if(aa==true) {
		System.out.println("ON");
	}
	else {
		System.out.println("OFF");
	}
	Thread.sleep(2000); 
	 driver.quit();   

	}
	

}
