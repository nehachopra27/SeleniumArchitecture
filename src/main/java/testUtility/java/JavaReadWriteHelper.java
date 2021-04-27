package testutility.java;

import java.io.File;
import java.io.IOException;

public interface JavaReadWriteHelper {
	public void deleteFolder(File folderPath);
	public void createFolder(String folderPath);
	public void downloadFile(String sourceURL,String targetFolderName);
	public void unZip(String sourceURL,String targetFolderName) throws IOException;
	public void deleteFile(File folderPath);
}
