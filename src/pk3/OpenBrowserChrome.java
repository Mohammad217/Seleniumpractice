package pk3;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowserChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> tt = driver.findElements(By.tagName("a"));
		
//		for(int i=1;i<tt.size();i++){
//			
//			System.out.println(tt.get(i).getText());
//		}
		
		for(WebElement ele : tt){
			
			System.out.println(ele.getText());
		}
		
		
//		System.out.println(driver.getTitle());
//		if("Facebook - Log In or Sign Up".equalsIgnoreCase(driver.getTitle())){
//			
//			System.out.println("Right page title opened ");
//		}
//		
//		driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("xpath value");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Custom Xpath");
//		
//		WebElement ele=driver.findElement(By.xpath("//*[@id='month']"));
//		Select sel=new Select(ele);
//		sel.selectByVisibleText("Apr");
		
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		WebDriverWait wait=new WebDriverWait(driver, 300);
//		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		
//		String path1="//*[@id='content']/div/div/div/div[1]/div[";
//		String path2="]/span/span";
//		
//		for(int i=1;i<=3;i++){
//			
//			System.out.println(driver.findElement(By.xpath(path1+i+path2)).getText());
//			
//		}
//					
//		System.out.println(driver.findElement(By.xpath("//*[@id='cookie-use-link']")).getAttribute("rel"));
//		
		
		//driver.findElement(By.cssSelector("#u_0_m")).sendKeys("css selector");
		
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("custom selector");
		
		
//		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
//		System.out.println(driver.getTitle());
//		Thread.sleep(4000);
//		
//		driver.findElement(By.linkText("Help")).click();
//		driver.findElement(By.linkText("Privacy")).click();
//		driver.findElement(By.linkText("Terms")).click();
//		
//		Thread.sleep(4000);
//		
//		Set<String> handle = driver.getWindowHandles();
//		Iterator<String> it = handle.iterator();
		
//		String parent=it.next();
//		String terms=it.next();
//		String privacy=it.next();
//		String helps=it.next();
//		
//		driver.switchTo().window(privacy);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(helps);
//		System.out.println(driver.getTitle());
//		driver.close();
//		Thread.sleep(4000);
//		
//		driver.switchTo().window(terms);
//		System.out.println(driver.getTitle());
//		driver.quit();
		
		
//		while(it.hasNext()){
//			
//			String child=it.next();
//			driver.switchTo().window(child);
//			System.out.println(driver.getTitle());
//			driver.close();
//			
//		}
		
		
//		
//		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
//		Thread.sleep(300);
//		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		driver.quit();
		
		
		
//		driver.get("https://jqueryui.com/droppable/");
//		
//		Thread.sleep(500);
//		
//		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/p[1]")).getText());
//		
//		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
//		
//		driver.switchTo().frame(0);
//		
//		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/p")).getText());
//		
//		WebElement drag = driver.findElement(By.xpath("/html/body/div[1]/p"));
//		WebElement drop = driver.findElement(By.xpath("/html/body/div[2]/p"));
//		
//		Actions act=new Actions(driver);
//		act.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
