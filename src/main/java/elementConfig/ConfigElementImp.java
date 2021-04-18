package elementConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.GlobalVariables;

public class ConfigElementImp extends GlobalVariables implements ConfigureElement {

	public By getElement(_elementType elementType, String elementLocator) {
		By objBy = null;
		switch (elementType) {
		case ByID: {
			objBy = By.id(elementLocator);
			break;
		}
		case ByCssSelector: {
			objBy = By.cssSelector(elementLocator);
			break;
		}
		case ByClassName: {
			objBy = By.className(elementLocator);
			break;
		}
		case ByLinkText: {
			objBy = By.linkText(elementLocator);
			break;
		}
		case ByXpath: {
			objBy = By.xpath(elementLocator);
			break;
		}
		case ByPartialLinkText: {
			objBy = By.partialLinkText(elementLocator);
			break;
		}
		case Byjs: {
			break;
		}
		}
		return objBy;

	}

	public WebElement getElement(By locator) {
		return seleniumDriver.findElement(locator);
	}

}
