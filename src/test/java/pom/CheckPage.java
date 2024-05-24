package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckPage {

    //Проверяем логотип Победы
    private SelenideElement logo = $(By.xpath("//*[@id=\"__next\"]/div[2]/header/div[2]/div/a[1]/img"));

    //Проверка поля Откуда
    private SelenideElement whereFrom = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[1]/div/div[1]/div/div/input"));

    //Проверка поля Куда
    private SelenideElement where = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[1]/div/div[4]/div[1]/div/input"));

    //Проверка поля Дата вылета туда
    private SelenideElement departureDateThere = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/input"));

    //Проверка поля Дата вылета обратно
    private SelenideElement returnFlightDate = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div[1]/div[3]/div/input"));

    //Проверка что после нажатия на кнопку "Поиск" около поля «Туда» появилась красная обводка.
    private SelenideElement strokePanel = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div"));

    //Проверка поля «Номер заказа или билета»
    private SelenideElement orderOrTicketNumber = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/form/div/div[2]/div/div/input"));

    //Проверка поля «Фамилия клиента»
    private SelenideElement clientLastName = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/form/div/div[1]/div/div/input"));

    //Проверка наличия поля есть кнопка «Поиск»
    private SelenideElement theSearchButton = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/form/div/div[3]/button"));

    //Проверка что в новой вкладке на экране отображается текст ошибки «Заказ с указанными параметрами не найден»
    private SelenideElement textError = $(By.xpath("/html/body/div[1]/section/div[1]/div/div/div[2]"));

    @Step("Проверка поля Откуда")
    public SelenideElement getWhereFrom() {
        return whereFrom.shouldBe(visible);
    }

    @Step("Проверка поля Куда».")
    public SelenideElement getWhere() {
        return where.shouldBe(visible);
    }

    @Step("Проверка поля Дата вылета туда")
    public SelenideElement getDepartureDateThere() {
        return departureDateThere.shouldBe(visible);
    }

    @Step("Проверка поля Дата вылета обратно")
    public SelenideElement getReturnFlightDate() {
        return returnFlightDate.shouldBe(visible);
    }

    @Step("Проверяем логотип Победы")
    public boolean getLogo() {
        return logo.isDisplayed();
    }

    @Step("Проверка что после нажатия на кнопку \"Поиск\" около поля «Туда» появилась красная обводка.")
    public String getStrokePanel() {
        return strokePanel.getCssValue(".dp-1bgth1z-root[data-errored]");
    }

    @Step("Проверка поля «Номер заказа или билета»")
    public SelenideElement getOrderOrTicketNumber() {
        return orderOrTicketNumber.shouldBe(visible);
    }

    @Step("Проверка поля «Фамилия клиента»")
    public SelenideElement getClientLastName() {
        return clientLastName.shouldBe(visible);
    }

   @Step("Проверка наличия поля есть кнопка «Поиск»")
    public SelenideElement getTheSearchButton() {
        return theSearchButton.shouldBe(visible);
    }

    @Step("Проверка что в новой вкладке на экране отображается текст ошибки «Заказ с указанными параметрами не найден»")
    public String getTextError() {
        return textError.getText();
    }

    @Step("Проверка отображений наименований")
    public boolean isDisplayed(String name) {

        boolean present;
        try {
            $(By.xpath("//*[contains(text(),'" + name + "')]")).isDisplayed();
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }
}
