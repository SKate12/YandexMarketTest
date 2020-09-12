package pages.OtherElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * Кнопка с текстом {@link OtherElements#buttonByText(String)}
 * Элемент чекбокса с его параметрами {@link OtherElements#buttonByText(String)}
 * Кликабельный элемент чекбокса {@link OtherElements#buttonByText(String)}
 */
public class OtherElements {
    static SelenideElement buttonByText( String buttonText){
        return $(By.xpath("//div[text()='"+buttonText+"']/parent::button"));
    }

    static SelenideElement checkBoxInputByText(String text){
        return $(By.xpath("//span[text()='"+text+"']//ancestor::label//input[@type='checkbox']"));
    }

    static SelenideElement checkBoxByText(String text){
        return checkBoxInputByText(text).$(By.xpath("parent::*"));
    }
}
