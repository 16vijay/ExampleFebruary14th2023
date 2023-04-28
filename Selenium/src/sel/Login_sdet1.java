package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_sdet1 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
		//ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();

		String exp_tittle="Login: Mercury Tours";
		String actu_tittle=driver.getTitle();
		//System.out.println(driver.getTitle());

		if(exp_tittle.equals(actu_tittle)==true) {
			System.out.println("test is passed");
		}else {
			System.out.println("test is failed");
		
		}
		driver.close();
	}

}
