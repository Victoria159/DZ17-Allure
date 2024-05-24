package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DataEntryPage {

    //Ввести в поле значение "Москва"
    private SelenideElement addCity = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[1]/div/div[1]/div[1]/div/input"));

    //Ввести в поле значение "Санкт-Петербург"
    private SelenideElement addCity2 = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[1]/div/div[1]/div/div[4]/div[1]/div/input"));

    //Нажать кнопку Поиск
    private SelenideElement pressButton = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/div[3]/form/div/div[4]/button"));

    //Кликнуть на пункт «Управление бронированием»
    private SelenideElement clickButton = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[1]/div[2]/button[3]"));

    //Ввести в поле ввода данные: номер заказа – XXXXXX
    private SelenideElement addOrderNumber = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/form/div/div[2]/div/div/input"));

    //Ввести в поле ввода данные: фамилия – Qwerty
    private SelenideElement addSurname = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/form/div/div[1]/div/div/input"));

    //Нажать кнопку Поиск в пункте «Управление бронированием»
    private SelenideElement pressButton2 = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[2]/form/div/div[3]/button"));

    @Step("Ввести в поле значение \"Москва\"")
    public void getAddCity() {
        addCity.setValue("Москва").pressEnter();
    }

    @Step("Ввести в поле значение \"Санкт-Петербург\"")
    public void getAddCity2() {
        addCity2.setValue("Санкт-Петербург").pressEnter();
    }

    @Step("Нажать кнопку Поиск")
    public void clockButton() {
        pressButton.shouldBe(visible).click();
    }

    @Step("Кликнуть на пункт «Управление бронированием»")
    public void clickButtonBookingManagement() {
        clickButton.click();
    }

    @Step("Ввести в поле ввода данные: фамилия – Qwerty")
    public void getAddSurname() {
        addSurname.setValue("Qwerty").pressEnter();
    }

    @Step("Ввести в поле ввода данные: номер заказа – XXXXXX")
    public void getAddOrderNumber() {
        addOrderNumber.setValue("XXXXXX").pressEnter();
    }

    @Step("Нажать кнопку Поиск в пункте «Управление бронированием»")
    public void clockButton2() {
        pressButton2.click();
    }
}
