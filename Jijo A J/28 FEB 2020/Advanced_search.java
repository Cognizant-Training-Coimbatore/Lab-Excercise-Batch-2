import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Advanced_search {
	WebDriver driver;
	String URL = "https://www.shaadi.com/search?search_type=smart_search&loc=top-nav";
public Advanced_search(WebDriver driver) {
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
	void ChatStatus() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"avchat-Yes\"]")).click();
	Thread.sleep(2000);
	}
	void postedBy() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"postedbyarray-Self\"]")).click();
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