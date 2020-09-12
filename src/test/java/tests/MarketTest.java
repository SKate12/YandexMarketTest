package tests;

import config.DriverSettings;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage.MainPageSteps;
import pages.MarketPage.MarketPageSteps;
import pages.OtherElements.OtherElementsSteps;
import utils.CommonMethods;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.open;

public class MarketTest extends DriverSettings {
    @Test
    void TestXiaomiRedmiBook() {
        open("https://yandex.ru/");

        MainPageSteps.checkMainPageTitle();
        MainPageSteps.checkMarketSectionDisplayed();
        
        MainPageSteps.clickMarketSection();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        MarketPageSteps.checkMarketPageTitle();

        MarketPageSteps.findProductBySearchInput("ноутбук xiaomi redmibook");

        String checkBoxText = "Сначала предложения в моём регионе";
        OtherElementsSteps.clickCheckBoxByText(checkBoxText);
        driver.navigate().refresh();
        Assert.assertTrue(OtherElementsSteps.isCheckBoxByTextTurnOn(checkBoxText),
                "Чекбокс " + checkBoxText + " не включен");

        CommonMethods.saveScreenShot(driver, "xiaomiRedmiBookSearchResult.jpg");
    }
}
