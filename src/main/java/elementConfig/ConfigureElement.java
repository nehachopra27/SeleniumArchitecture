package elementConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.GlobalVariables._elementType;

public interface ConfigureElement {
	public By getElement(_elementType elementType,String elementLocator);
	public WebElement getElement(By locator);
}
