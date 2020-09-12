package pages.MarketPage;

import org.testng.Assert;
import pages.OtherElements.OtherElementsSteps;

/**
 * Проверка наличия на главной странице заголовка{@link MarketPageSteps#checkMarketPageTitle()}
 * Ввести значения в строку поиска{@link MarketPageSteps#setValuesInSearchInput(String)}
 * Выполнить поиск через строку поиска нажав кнопку "Найти"{@link MarketPageSteps#findProductBySearchInput(String)}
 */
public class MarketPageSteps extends MarketPage {
    public static void checkMarketPageTitle() {
        Assert.assertTrue(titleMarketPage().isDisplayed(), "Заголовок на странице Яндекс Маркет не отображается");
    }

    public static void setValuesInSearchInput(String values) {
        searchInputField().setValue(values);
    }

    public static void findProductBySearchInput(String productName) {
        setValuesInSearchInput(productName);
        OtherElementsSteps.clickButtonByText("Найти");
    }
}
