import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basic_search {
	WebDriver driver;
	String URL = "https://www.shaadi.com/search";
public Basic_search(WebDriver driver) {
	this.driver=driver;
	}

	void launch() {
		driver.get(URL);
	}
	void SelectNoChild() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"children-No\"]")).click();
		Thread.sleep(2000);
	}
	void ClickSearch() throws InterruptedException
	{driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/a/span[1]")).click();
    Thread.sleep(5000);
    }
	void close() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
