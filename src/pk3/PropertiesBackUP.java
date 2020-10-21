package pk3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesBackUP {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Properties pf=new Properties();
		FileInputStream fl=new FileInputStream("C:\\Users\\hasan\\workspace\\BatchMarch2020\\march20.properties");
		pf.load(fl);
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(pf.getProperty("firstName"));

		
		 Set<String> name=pf.stringPropertyNames();
		 
		 Iterator<String> it=name.iterator();
		 
		 while(it.hasNext()){
			 
			 String value = it.next();
			 System.out.println(pf.getProperty(value));
		 }
	}
	
}
