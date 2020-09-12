package config;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

/**
 * Основной конфигурационный класс
 */
public class DriverSettings {
    public static WebDriver driver;

    @BeforeMethod
    public static void driverSettings(Method method) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterMethod()
    public static void closeDriver(ITestResult iTestResult) {
        WebDriverRunner.closeWebDriver();
        driver.quit();
    }
}
