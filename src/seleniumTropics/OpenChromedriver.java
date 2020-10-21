package seleniumTropics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenChromedriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//System.out.println("This is the current URL : "+driver.getCurrentUrl());
		//System.out.println("This is the current page title : "+driver.getTitle());
		
//		if(driver.getTitle().equalsIgnoreCase("Facebook - Log In or Sign Up1")){
//			
//			System.out.println("This is the right page title ");
//		}
//		else
//		{
//			System.out.println( "This is not right page title ");
//		}
		
		
		//Xpath technique for find element
		
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("anything@gmail.com");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("nohakali ango bari");
//		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		
		
		//Custom Xapth   //tagname[@attributes='value']
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("This is  a custom xpath ");
		
		//ID technique 
		
		//driver.findElement(By.id("email")).sendKeys("This is id technique");
		
		
		//Name Technique
		
		//driver.findElement(By.name("pass")).sendKeys("This is name technique");
		
		//class technique /not recommended 
		
		//driver.findElement(By.className("")).click();
		
		
		//LinkText Technique
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//Partial LinkText Technique
		
		//driver.findElement(By.partialLinkText("account?")).click();
		
		
		
		//Select DropDown list
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='month']"));
		
		Select sel=new Select(ele);//(driver.findElement(By.xpath("//*[@id='month']")));
		
		//sel.selectByVisibleText("Mar");
		//sel.selectByIndex(7);
		sel.selectByValue("7");
		

	}

}
