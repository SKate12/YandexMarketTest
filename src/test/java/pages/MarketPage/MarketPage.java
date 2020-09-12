package pages.MarketPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Заголовок на странице ЯндексМаркет{@link MarketPage#titleMarketPage()}
 * Строка поиска {@link MarketPage#searchInputField()}
 */
public class MarketPage {
    static SelenideElement titleMarketPage() {
        return $(By.xpath("//div[@class='_7v6Uf-UYpr _2AL_nfH3zl']//*[text()='Маркет']"));
    }

    static SelenideElement searchInputField() {
        return $(By.xpath("//input[@id='header-search']"));
    }
}
