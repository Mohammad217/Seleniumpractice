package seleniumTropics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String> st = driver.getWindowHandles();
		
		 Iterator<String> it = st.iterator();
		 
		 String parent=it.next();
		 String Privacy=it.next();
		 String helps=it.next();
		 
		 driver.switchTo().window(Privacy);
		 
		 System.out.println(driver.getTitle());
		 driver.close();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().window(helps);
		 System.out.println(driver.getTitle());
		 driver.quit();
		 
		 
//		 while(it.hasNext()){
//			 
//			 String child = it.next();
//			 driver.switchTo().window(child);
//			 System.out.println(driver.getTitle());
//			 
//		 }
		
	}

}
