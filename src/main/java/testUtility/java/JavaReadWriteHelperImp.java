package testutility.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import testinit.GlobalVariables;

public class JavaReadWriteHelperImp extends GlobalVariables implements JavaReadWriteHelper {

	File file;

	public void deleteFolder(File folderPath) {
		if (folderPath.exists()) {
			for (File subFile : folderPath.listFiles()) {
				if (subFile.isDirectory()) {
					deleteFolder(subFile);
				} else {
					subFile.delete();
				}
			}
			if (folderPath.delete())
				System.out.println("folder " + folderPath + " has been deleted");
		}

	}

	public void createFolder(String folderPath) {
		file = new File(folderPath);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public void downloadFile(String sourceURL, String targetFolderName) {

		try {
			InputStream in = URI.create(sourceURL).toURL().openStream();
			Files.copy(in, Paths.get(targetFolderName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void unZip(String zipFilePath, String destDir) throws IOException {
		File dir = new File(destDir);
		// create output directory if it doesn't exist
		if (!dir.exists())
			dir.mkdirs();
		// buffer for read and write data to file
		byte[] buffer = new byte[1024];

		try (FileInputStream fis = new FileInputStream(zipFilePath); ZipInputStream zis = new ZipInputStream(fis);) {
			ZipEntry ze = zis.getNextEntry();
			while (ze != null) {
				String fileName = ze.getName();
				File newFile = new File(destDir + File.separator + fileName);
				// create directories for sub directories in zip
				new File(newFile.getParent()).mkdirs();
				try (FileOutputStream fos = new FileOutputStream(newFile);) {
					int len;
					while ((len = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// close this ZipEntry
				zis.closeEntry();
				ze = zis.getNextEntry();
				// close last ZipEntry
				zis.closeEntry();
				zis.close();
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteFile(File folderPath) {
		if (folderPath.exists() && !folderPath.delete())
			log.info("Unable to delete the file");
	}

}
