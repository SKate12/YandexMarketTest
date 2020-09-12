package pages.MainPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Заголовок на главной странице {@link MainPage#titleMainPage()}
 * Раздел Маркет на главной странице {@link MainPage#sectionMarket()}
 */
public class MainPage {
    static SelenideElement titleMainPage() {
        return $(By.xpath("//div[@class='home-logo__default'and @aria-label='Яндекс']"));
    }

    static SelenideElement sectionMarket() {
        return $(By.xpath("//a[@data-id='market']"));
    }
}
