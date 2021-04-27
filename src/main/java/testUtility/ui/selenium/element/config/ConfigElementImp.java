package testutility.ui.selenium.element.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testinit.GlobalVariables;

public class ConfigElementImp extends GlobalVariables implements ConfigureElement {

	public By getElement(ElementType elementType, String elementLocator) {
		By objBy = null;
		switch (elementType) {
		case BYID:
			objBy = By.id(elementLocator);
			break;
		case BYCSSSELECTOR:
			objBy = By.cssSelector(elementLocator);
			break;
		case BYCLASSNAME:
			objBy = By.className(elementLocator);
			break;
		case BYLINKTEXT:
			objBy = By.linkText(elementLocator);
			break;
		case BYXPATH:
			objBy = By.xpath(elementLocator);
			break;
		case BYPARTIALLINKTEXT:
			objBy = By.partialLinkText(elementLocator);
			break;
		case BYJS:
			break;
		}
		return objBy;

	}

	public WebElement getElement(By locator) {
		return seleniumDriver.findElement(locator);
	}

}
