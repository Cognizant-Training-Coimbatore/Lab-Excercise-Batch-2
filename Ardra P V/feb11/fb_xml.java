package repository;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_xml {
	public static void main(String[] args) throws IOException, InterruptedException, DocumentException {
	FileInputStream ip=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\webDriverDemo\\src\\repository\\fb.xml");
    SAXReader fil=new SAXReader();
    org.dom4j.Document doc=fil.read(ip);
    String url=doc.selectSingleNode("//fb/url").getText();
    String uid=doc.selectSingleNode("//fb/uid").getText();
    String pwd=doc.selectSingleNode("//fb/pwd").getText();
    String btn=doc.selectSingleNode("//fb/btn").getText();
    String uidv=doc.selectSingleNode("//fb/uidv").getText();
    String pwdv=doc.selectSingleNode("//fb/pwdv").getText();
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(url);
	Thread.sleep(5000);
	driver.findElement(By.id(uid)).sendKeys(uidv);
	driver.findElement(By.id(pwd)).sendKeys(pwdv);
	driver.findElement(By.xpath(btn)).click();
	Thread.sleep(5000);
	driver.quit();
}
}