import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutten {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("D://amrutha//html//aoo.html");
		    System.out.println(driver.getTitle());
		    //WebElement link=driver.findElement(By.linkText("google"));
		    List<WebElement>radio= driver.findElements(By.name("gender"));
		    System.out.println(radio.get(0).isSelected());//to check whwther 0 th radio button selected/if yes print true.
		    System.out.println(radio.get(1).isSelected());
		    Thread.sleep(2000);
		    radio.get(0).click();
		    System.out.println(radio.get(0).isSelected());
		   
		    Thread.sleep(2000);
		    driver.quit();
	}

}
