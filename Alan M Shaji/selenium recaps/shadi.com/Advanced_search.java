import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_search {

	WebDriver driver;
	String URL = "https://www.shaadi.com/search?search_type=smart_search&loc=top-nav";
public Advanced_search(WebDriver driver) {
	this.driver=driver;
	}

	void launch() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(URL);
	}
	void SelectNoChild() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"children-No\"]")).click();
	}
	void postedBy() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"postedbyarray-Self\"]")).click();
	}
	void ClickSearch() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"smart\"]/div[4]/a/span[1]")).click();
    Thread.sleep(5000);
    }

}