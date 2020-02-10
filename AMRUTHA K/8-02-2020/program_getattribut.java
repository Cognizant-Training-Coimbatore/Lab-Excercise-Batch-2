import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_getattribut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("D://amrutha//html//aoo.html");
		    System.out.println(driver.getTitle());
		    //WebElement link=driver.findElement(By.linkText("google"));
		     driver.findElement(By.id("txt1")).sendKeys("ammu");
		     String s= driver.findElement(By.id("txt1")).getAttribute("value");//to assisgn the value into s
		     System.out.println(s.length());
		    Thread.sleep(2000);
		    driver.quit();
		    
	}

}
