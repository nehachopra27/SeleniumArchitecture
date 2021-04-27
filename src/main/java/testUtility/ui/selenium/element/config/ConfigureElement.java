package testutility.ui.selenium.element.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testinit.GlobalVariables.ElementType;

public interface ConfigureElement {
	public By getElement(ElementType elementType,String elementLocator);
	public WebElement getElement(By locator);
}
