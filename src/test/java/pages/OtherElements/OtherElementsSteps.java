package pages.OtherElements;

/**
 * Нажать на кнопку с текстом {@link OtherElementsSteps#clickButtonByText(String)}
 * Нажать чекбокс с тестом {1}{@link OtherElementsSteps#clickCheckBoxByText(String)}
 * Проверка включен ли чекбокс с тестом {1}{@link OtherElementsSteps#isCheckBoxByTextTurnOn(String)}
 */
public class OtherElementsSteps extends OtherElements {
    public static void clickButtonByText(String buttonText) {
        buttonByText(buttonText).click();
    }

    public static void clickCheckBoxByText(String checkBoxText) {
        checkBoxByText(checkBoxText).click();
    }

    public static boolean isCheckBoxByTextTurnOn(String checkBoxText) {
        return Boolean.parseBoolean(checkBoxInputByText(checkBoxText).getAttribute("checked"));
    }
}
