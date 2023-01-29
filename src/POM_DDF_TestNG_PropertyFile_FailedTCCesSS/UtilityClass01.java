package POM_DDF_TestNG_PropertyFile_FailedTCCesSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass01 {
	
	
	

	public static String  GetTD(int rowindex,int collindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\3sep_newprogram\\TestData\\pra1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 
		 
		String value = sh.getRow(rowindex).getCell(collindex).getStringCellValue();
		return value;
	}	
	
	
		public static void captureSS(WebDriver driver,int TCID) throws IOException
		{
			//driver.findElement(By.xpath("//div[@id='root']"));
			
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\91899\\eclipse-workspace\\3sep_newprogram\\FailedTesscasesSS"+TCID+".png");
		
		FileHandler.copy(src, dest);
		
	}
		
		public static String readDataFromPF(String key) throws IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\3sep_newprogram\\PropertiesFile.properties");
			 
			Properties p=new Properties();
			p.load(file);
			
			String value = p.getProperty(key);
			return value;
		}
	
	
	
	
	

}
