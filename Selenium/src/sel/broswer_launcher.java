 package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class broswer_launcher {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.youtube.com/");
	
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf2 trailer");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
	    
	
	}

}
