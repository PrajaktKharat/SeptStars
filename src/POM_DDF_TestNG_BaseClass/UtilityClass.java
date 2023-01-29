package POM_DDF_TestNG_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	
	

	public static String  GetTD(int rowindex,int collindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\praj-work\\pra1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 
		 
		String value = sh.getRow(rowindex).getCell(collindex).getStringCellValue();
		return value;
	}	
	
	
		public static void captureSS(WebDriver driver,int TCid) throws IOException
		{
			driver.findElement(By.xpath("//div[@id='root']"));
			
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\praj-work\\screenshort\\pra"+TCid+".png");
		
		FileHandler.copy(src, dest);
		
		
	}
	
	
	
	
	

}
