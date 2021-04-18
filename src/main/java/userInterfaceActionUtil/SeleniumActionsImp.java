package userInterfaceActionUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elementConfig.ConfigElementImp;
import elementConfig.ConfigureElement;
import util.GlobalVariables;

public class SeleniumActionsImp extends GlobalVariables implements SeleniumActions {

	ConfigureElement objConfigureElement=new ConfigElementImp();
	public int getURL(String url) {
		try {
			seleniumDriver.get(url);
			return 1;
		} catch (Exception e) {
			errorLog(e, "not able to get url" + url);
			return 0;
		}

	}

	public int validateTitle(String title) {
		try {
			if (seleniumDriver.getTitle().equals(title)) {
				return 1;
			} else {
				log.error("title mismatch " + title);
				return 0;
			}
		} catch (Exception e) {
			errorLog(e, "not able to map the title" + title);
			return 0;
		}
	}

	public int waituntilElementDisplayed(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return 1;
		} catch (Exception e) {
			errorLog(e, "waituntilElementDisplayed time out");
			return 0;
		}
	}

	public int waituntilElementDisplayed(WebElement element, int timeOutInSeconds) {
		return 0;
//		try {
//			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
//			ExpectedCondition<Boolean> elementIsDisplayed = arg0 -> element.isDisplayed();
//			wait.until(elementIsDisplayed);
//			return 1;
//		} catch (Exception e) {
//			log.error("waituntilElementDisplayed time out");
//			log.error(e.getMessage());
//			return 0;
//		}
	}

	public int moveToElement(WebElement element) {
		try {
			Actions act = new Actions(seleniumDriver);
			act.moveToElement(element).build().perform();
			return 0;
		} catch (Exception e) {
			errorLog(e, "not able to move till element");
			return 0;
		}
	}

	public int elementIsDislayed(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			if (element.isDisplayed())
				return 1;
			else
				return 0;
		} catch (Exception e) {
			errorLog(e, "not able to validate display element");
			return 0;
		}
	}

	public int elementIsEnable(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			if (element.isEnabled())
				return 1;
			else
				return 0;
		} catch (Exception e) {
			errorLog(e, "not able to validate display is enable");
			return 0;
		}
	}

	public int elementIsNotEnable(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			if (!element.isEnabled())
				return 1;
			else
				return 0;
		} catch (Exception e) {
			errorLog(e, "not able to validate display is not enable");
			return 0;
		}
	}

	public int click(By locator, int timeOutInSeconds) {
		try {
			WebElement element = objConfigureElement.getElement(locator);
			click(element, timeOutInSeconds);
			return 1;
		} catch (Exception e) {
			errorLog(e, "not able to click on element");
			return 0;
		}
	}

	public int click(WebElement element, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(element, timeOutInSeconds);
			elementClickable(element, timeOutInSeconds);
			moveToElement(element);
			element.click();
			return 1;
		} catch (Exception e) {
			errorLog(e, "not able to click on element");
			return 0;
		}
	}

	public int wait(int timeOutInSeconds) {
		try {
			Thread.sleep(timeOutInSeconds);
		} catch (InterruptedException e) {
			errorLog(e, "sleep wait is not working");
			return 0;
		}
		return 0;
	}

	public int sendKeyElement(By locator, String txt, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			element.sendKeys(Keys.CONTROL + "a");
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(txt);
			return 1;
		} catch (Exception e) {
			errorLog(e, "not able to send key");
			return 0;
		}
	}

	public int elementClickable(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return 1;
		} catch (Exception e) {
			errorLog(e, "element not clickable");
			return 0;
		}
	}

	public int elementClickable(WebElement element, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return 1;
		} catch (Exception e) {
			errorLog(e, "element not clickable");
			return 0;
		}
	}

	public String getText(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			return element.getText();
		} catch (Exception e) {
			errorLog(e, "not able to get text");
			return null;
		}

	}

	public int waitUntilElementNotVisable(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			wait.until(ExpectedConditions.visibilityOf(element));
			return 1;
		} catch (Exception e) {
			errorLog(e, "element not visable");
			return 0;
		}
	}

	public int waitUntilElementVisable(By locator, int timeOutInSeconds) {

		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			return 1;
		} catch (Exception e) {
			errorLog(e, "element not visable");
			return 0;
		}
	}

	public int validateTxt(String source, String target) {
		if (source.equals(target)) {
			return 1;
		} else {
			return 0;
		}
	}

	public int closeDriver() {
		try {
			if (null != seleniumDriver) {
				seleniumDriver.close();
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			errorLog(e, "not able to close driver");
			return 0;
		}
	}

	public void exitSystem() {
		System.exit(0);
	}

	public int quitDriver() {
		try {
			if (null != seleniumDriver) {
				seleniumDriver.quit();
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			errorLog(e, "not able to quit driver");
			return 0;
		}
	}

	public int refreshPage() {
		try {
			seleniumDriver.navigate().refresh();
			return 1;
		} catch (Exception e) {
			errorLog(e, "not able to refresh page");
			return 0;
		}
	}

	private void errorLog(Exception e, String message) {
		log.error(message);
		log.error(e.getMessage());
	}

	
}
