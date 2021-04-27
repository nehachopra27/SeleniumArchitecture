package testutility.ui.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testinit.GlobalVariables;
import testutility.ui.selenium.element.config.ConfigElementImp;
import testutility.ui.selenium.element.config.ConfigureElement;

public class SeleniumActionsImp extends GlobalVariables implements SeleniumActions {

	ConfigureElement objConfigureElement = new ConfigElementImp();

	public boolean getURL(String url) {
		try {
			seleniumDriver.get(url);
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to get url" + url);
			return false;
		}

	}

	public boolean validateTitle(String title) {
		try {
			if (seleniumDriver.getTitle().equals(title)) {
				return true;
			} else {
				log.error("title mismatch " + title);
				return false;
			}
		} catch (Exception e) {
			errorLog(e, "not able to map the title" + title);
			return false;
		}
	}

	public boolean waituntilElementDisplayed(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			errorLog(e, "waituntilElementDisplayed time out");
			return false;
		}
	}

	public boolean waituntilElementDisplayed(WebElement element, int timeOutInSeconds) {
		return true;
	}

	public boolean moveToElement(WebElement element) {
		try {
			Actions act = new Actions(seleniumDriver);
			act.moveToElement(element).build().perform();
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to move till element");
			return false;
		}
	}

	public boolean elementIsDislayed(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			return element.isDisplayed();

		} catch (Exception e) {
			errorLog(e, "not able to validate display element");
			return false;
		}
	}

	public boolean elementIsEnable(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			return element.isEnabled();
		} catch (Exception e) {
			errorLog(e, "not able to validate display is enable");
			return false;
		}
	}

	public boolean elementIsNotEnable(By locator, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			return !element.isEnabled();
		} catch (Exception e) {
			errorLog(e, "not able to validate display is not enable");
			return false;
		}
	}

	public boolean click(By locator, int timeOutInSeconds) {
		try {
			WebElement element = objConfigureElement.getElement(locator);
			click(element, timeOutInSeconds);
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to click on element");
			return false;
		}
	}

	public boolean click(WebElement element, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(element, timeOutInSeconds);
			elementClickable(element, timeOutInSeconds);
			moveToElement(element);
			element.click();
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to click on element");
			return false;
		}
	}

	public boolean wait(int timeOutInSeconds) {
		try {
			Thread.sleep(timeOutInSeconds);
			return true;
		} catch (InterruptedException e) {
			errorLog(e, "sleep wait is not working");
			Thread.currentThread().interrupt();
			return false;

		}
	}

	public boolean sendKeyElement(By locator, String txt, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(locator, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			moveToElement(element);
			element.sendKeys(Keys.CONTROL + "a");
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(txt);
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to send key");
			return false;
		}
	}

	public boolean sendKeyElement(WebElement element, String txt, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(element, timeOutInSeconds);
			moveToElement(element);
			element.sendKeys(Keys.CONTROL + "a");
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(txt);
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to send key");
			return false;
		}
	}

	public boolean elementClickable(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		} catch (Exception e) {
			errorLog(e, "element not clickable");
			return false;
		}
	}

	public boolean elementClickable(WebElement element, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			errorLog(e, "element not clickable");
			return false;
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

	public String getText(WebElement element, int timeOutInSeconds) {
		try {
			waituntilElementDisplayed(element, timeOutInSeconds);
			moveToElement(element);
			return element.getText();
		} catch (Exception e) {
			errorLog(e, "not able to get text");
			return null;
		}
	}

	public boolean waitUntilElementNotVisable(By locator, int timeOutInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			WebElement element = objConfigureElement.getElement(locator);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			errorLog(e, "element not visable");
			return false;
		}
	}

	public boolean waitUntilElementVisable(By locator, int timeOutInSeconds) {

		try {
			WebDriverWait wait = new WebDriverWait(seleniumDriver, timeOutInSeconds);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			errorLog(e, "element not visable");
			return false;
		}
	}

	public boolean validateTxt(String source, String target) {
			return source.equals(target);
	
	}

	public boolean validateTextExistOnPage(String txt) {
		return seleniumDriver.getPageSource().contains(txt);

	}

	public boolean closeDriver() {
		try {
			if (null != seleniumDriver) {
				seleniumDriver.close();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			errorLog(e, "not able to close driver");
			return false;
		}
	}

	public void exitSystem() {
		System.exit(0);
	}

	public boolean quitDriver() {
		try {
			if (null != seleniumDriver) {
				seleniumDriver.quit();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			errorLog(e, "not able to quit driver");
			return false;
		}
	}

	public boolean refreshPage() {
		try {
			seleniumDriver.navigate().refresh();
			return true;
		} catch (Exception e) {
			errorLog(e, "not able to refresh page");
			return false;
		}
	}

	private void errorLog(Exception e, String message) {
		log.error(message);
		log.error(e.getMessage());
	}

}
