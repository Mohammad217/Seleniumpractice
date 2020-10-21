package seleniumTropics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameandDragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		//Tag name iframe or frameset

		//System.out.println(driver.findElement(By.xpath("//*[@id='content']/p[1]")).getText());
		
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']/p")).getText());
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']/p"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']/p"));
		
		
		Actions act =new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
