package Sel2_Sg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_lanching {
	public static WebDriver oBroswer=null;

	public static void main(String[] args) {
		launchBroswer();
		navigate();
		closeapplication();
	}

	private static void launchBroswer() {
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\geckodriver.exe");
			oBroswer=new FirefoxDriver();
		}catch(Exception e) {
			e.printStackTrace();

		}

	}
	private static void navigate() {
		try {
			oBroswer.get("http://localhost:81/login.do");
			Thread.sleep(10000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	private static void closeapplication() {
		try {
			oBroswer.close();

		}catch(Exception e) {
			e.printStackTrace();

		}

	}

}
