package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UDemo{ 

public static boolean isFramePresent(WebDriver obrowser) {
boolean status=false;
try {
	List<WebElement>oFrames=obrowser.findElements(By.tagName("iFrames"));
	status=(oFrames.size()>0);
}catch (Exception e) {
	status=false;
	
}
return status;
}
public static int getFramesCount(WebDriver obrowser) {
	int count=0;
	try {
		List<WebElement> oFrames=obrowser.findElements(By.tagName("iFrame"));
		count=oFrames.size();
	}catch (Exception e) {
	count=-1;	
	}
	return count;
}
}
public static boolean get FrameControl("WebDriver obrowser","WebElement oEle") {
	boolean status=true;
	try {
		obrowser.switchTo().frame(oEle);
		status=true;
	}catch(Exception e) {
		return status;
	}
}

