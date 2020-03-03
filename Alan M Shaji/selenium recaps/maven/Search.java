import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Search {
	WebDriver driver;
	
	Search(WebDriver driver)
	{
		this.driver=driver;
	}
	void launchme() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.chavaramatrimony.com\\");
		driver.manage().window().maximize();
	}
	void clickSearch() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"BtnQuicksearch\"]")).click();
		Thread.sleep(4000);
	}
	void screenshots() throws IOException, InterruptedException {
		Thread.sleep(4000);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         File DestFile=new File("D:\\Screenshots\\BasicSearch.png");
         FileUtils.copyFile(SrcFile, DestFile);

	}
	
}