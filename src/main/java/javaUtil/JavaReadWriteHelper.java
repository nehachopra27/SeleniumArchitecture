package javaUtil;

import java.io.File;

public interface JavaReadWriteHelper {
	public void deleteFolder(File folderPath);
	public void createFolder(String folderPath);
	public void downloadFile(String sourceURL,String targetFolderName);
	public void unZip(String sourceURL,String targetFolderName);
	public void deleteFile(File folderPath);
}
