package userInterfaceActionUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface SeleniumActions {
	public int getURL(String url);
	public int validateTitle(String title);
	public int waituntilElementDisplayed(By locator,int timeOutInSeconds);
	public int waituntilElementDisplayed(WebElement element,int timeOutInSeconds);
	public int moveToElement(WebElement element);
	public int elementIsDislayed(By locator,int timeOutInSeconds);
	public int elementIsEnable(By locator,int timeOutInSeconds);
	public int elementIsNotEnable(By locator,int timeOutInSeconds);
	public int click(By locator,int timeOutInSeconds);
	public int click(WebElement element,int timeOutInSeconds);
	public int wait(int waitTimeInMiliSecond);
	public int sendKeyElement(By locator, String txt,int timeOutInSeconds);
	public int elementClickable(By locator, int timeOutInSeconds);
	public int elementClickable(WebElement element, int timeOutInSeconds);
	public String getText(By locator,int timeOutInSeconds);
	public int waitUntilElementNotVisable(By locator, int timeOutInSeconds);
	public int waitUntilElementVisable(By locator,int timeOutInSeconds );
	public int validateTxt(String source,String target);
	public int closeDriver();
	public void exitSystem();
	public int quitDriver();
	public int refreshPage();
	
}
