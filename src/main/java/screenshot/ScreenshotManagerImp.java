package screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import util.GlobalVariables;

public class ScreenshotManagerImp extends GlobalVariables implements ScreenshotManager {

	
	public void takeScreenshot(String pathScreenshot, String fileName) {
		try {
			File src = ((TakesScreenshot) seleniumDriver).getScreenshotAs(OutputType.FILE);
			Path path = FileSystems.getDefault().getPath(pathScreenshot, fileName + ".png");
			Files.deleteIfExists(path);
			FileUtils.copyFile(src, new File(pathScreenshot + fileName + ".png"));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
}
