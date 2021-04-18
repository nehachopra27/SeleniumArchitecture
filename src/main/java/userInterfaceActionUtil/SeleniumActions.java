package userInterfaceActionUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface SeleniumActions {
	public boolean getURL(String url);
	public boolean validateTitle(String title);
	public boolean waituntilElementDisplayed(By locator,int timeOutInSeconds);
	public boolean waituntilElementDisplayed(WebElement element,int timeOutInSeconds);
	public boolean moveToElement(WebElement element);
	public boolean elementIsDislayed(By locator,int timeOutInSeconds);
	public boolean elementIsEnable(By locator,int timeOutInSeconds);
	public boolean elementIsNotEnable(By locator,int timeOutInSeconds);
	public boolean click(By locator,int timeOutInSeconds);
	public boolean click(WebElement element,int timeOutInSeconds);
	public boolean wait(int waitTimeInMiliSecond);
	public boolean sendKeyElement(By locator, String txt,int timeOutInSeconds);
	public boolean sendKeyElement(WebElement element, String txt,int timeOutInSeconds);
	public boolean elementClickable(By locator, int timeOutInSeconds);
	public boolean elementClickable(WebElement element, int timeOutInSeconds);
	public String getText(By locator,int timeOutInSeconds);
	public String getText(WebElement element,int timeOutInSeconds);
	public boolean validateTestExistOnPage(String txt);
	public boolean waitUntilElementNotVisable(By locator, int timeOutInSeconds);
	public boolean waitUntilElementVisable(By locator,int timeOutInSeconds );
	public boolean validateTxt(String source,String target);
	public boolean closeDriver();
	public void exitSystem();
	public boolean quitDriver();
	public boolean refreshPage();
	
}
