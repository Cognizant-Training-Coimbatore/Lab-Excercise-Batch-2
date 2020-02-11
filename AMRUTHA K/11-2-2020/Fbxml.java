package nwwww;

import java.io.File;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbxml {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub
  
		File ip=new File("D:\\amrutha\\java\\seleniumfile\\src\\nwwww\\FB.xml");
		SAXReader fil=new SAXReader();
		org.dom4j.Document doc= fil.read(ip);
		String url=doc.selectSingleNode("//fb/url").getText();
		String uid=doc.selectSingleNode("//fb/uid").getText();
		String pwd=doc.selectSingleNode("//fb/pwd").getText();
		String butn=doc.selectSingleNode("//fb/butn").getText();
		String uidv=doc.selectSingleNode("//fb/uidv").getText();
		String pwdv=doc.selectSingleNode("//fb/pwdv").getText();
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe") ;     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id(uid)).sendKeys(uidv);
		driver.findElement(By.id(pwd)).sendKeys(pwdv);
		driver.findElement(By.xpath(butn)).click();
		
		
		
		
		
		
	}

}
