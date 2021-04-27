package testengine.frame.visitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import testinit.GlobalVariables;
import testutility.java.JavaReadWriteHelperImp;

public class FrameSetupVisitorImp extends GlobalVariables implements FrameworkVisitor  {

	JavaReadWriteHelperImp myJavaFun = new JavaReadWriteHelperImp();

	public void setup(SetupSourceRepo setupSourceRepo) {
		myJavaFun.deleteFolder(new File(pathDirResource));
		myJavaFun.createFolder(pathDirResource);
	}

	public void setup(SetupOutputRepo setupOutputRepo) {
		myJavaFun.deleteFolder(new File(pathDirOutput));
		myJavaFun.createFolder(pathDirOutput);
	}

	public void setup(SetupLogFile setupLogFile) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("log4j.rootLogger", "INFO,FILE,console");
		prop.setProperty("log4j.appender.FILE", "org.apache.log4j.FileAppender");
		prop.setProperty("log4j.appender.FILE.File",pathFileLog4jReportHTML);
		prop.setProperty("log4j.appender.FILE.layout", "org.apache.log4j.HTMLLayout");
		prop.setProperty("log4j.appender.FILE.layout.Title", "HTML Layout Example");
		prop.setProperty("log4j.appender.FILE.layout.LocationInfo", "true");
		
		prop.setProperty("log4j.appender.console", "org.apache.log4j.ConsoleAppender");
		prop.setProperty("log4j.appender.console.target", "System.out");
		prop.setProperty("log4j.appender.console.immediateFlush", "true");
		prop.setProperty("log4j.appender.console.encoding", "UTF-8");
		prop.setProperty("log4j.appender.console.layout", "org.apache.log4j.PatternLayout");
		prop.setProperty("log4j.appender.console.layout.conversionPattern", "%d [%t] %-5p %c - %m%n");
		
		try (FileWriter fileWriter=new FileWriter(new File(pathLog4jProperties));) {	
			prop.store(fileWriter, "comments");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
