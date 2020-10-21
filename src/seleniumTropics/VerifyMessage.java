package seleniumTropics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMessage {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String st=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div[1]/span/span")).getText();
		System.out.println(st);
		
		//See photos and updates
		
		String expectedvalue="updates";
		
		String desirevalue=st.substring(15);
		System.out.println(desirevalue);
		
		
		if(desirevalue.equalsIgnoreCase(expectedvalue)){
			
			System.out.println("Right value");
		}
		else
			System.out.println("Wrong Value");

	}

}
