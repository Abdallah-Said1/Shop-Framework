package utilites;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class helper {
    public static void TackScreenShot(WebDriver driver, String ScreenName){
        Path des = Paths.get("./ScreenShots",ScreenName+".jpg");
        try {
            Files.createDirectories(des.getParent());
            FileOutputStream out=new FileOutputStream(des.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {
            System.out.println("Exception while take screenshot"+e.getMessage());
        }
    }
}
