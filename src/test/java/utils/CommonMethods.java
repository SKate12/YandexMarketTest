package utils;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Общие методы для тестовых классов
 * Сделать скриншот {@link CommonMethods#saveScreenShot(WebDriver, String)}
 */
public class CommonMethods {
    public static void saveScreenShot(WebDriver driver, String nameScreenshot) {
        try {
            byte[] bytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Files.write(Paths.get(nameScreenshot), bytes);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
