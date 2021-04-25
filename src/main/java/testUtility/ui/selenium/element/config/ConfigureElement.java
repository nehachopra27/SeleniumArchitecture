package testUtility.ui.selenium.element.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testInit.GlobalVariables._elementType;

public interface ConfigureElement {
	public By getElement(_elementType elementType,String elementLocator);
	public WebElement getElement(By locator);
}
