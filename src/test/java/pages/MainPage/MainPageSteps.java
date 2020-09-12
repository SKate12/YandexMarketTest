package pages.MainPage;

import org.testng.Assert;

/**
 * Проверка наличия на главной странице заголовка {@link MainPageSteps#checkMainPageTitle()}
 * Проверка наличия на главной странице раздела "Маркет" {@link MainPageSteps#checkMarketSectionDisplayed()}
 * Нажать на раздел  "Маркет" на главной странице {@link MainPageSteps#clickMarketSection()}
 */
public class MainPageSteps extends MainPage {
    public static void checkMainPageTitle() {
        Assert.assertTrue(titleMainPage().isDisplayed(), "Заголовок на главной странице не отображается");
    }

    public static void checkMarketSectionDisplayed() {
        Assert.assertTrue(sectionMarket().isDisplayed(), "Раздел \"Маркет\" на главной странице не отображается");
    }

    public static void clickMarketSection() {
        sectionMarket().click();
    }
}
