package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ScrollPage {
    //Проскроллить страницу к блоку поиска билета
    private SelenideElement scroll = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div/div[1]/div[2]/button[1]"));

    //Проскроллить страницу к сделующему блоку
    private SelenideElement scroll2 = $(By.xpath("//*[@id=\\\"__next\\\"]/div[2]/main/div/div/div[1]/div/div[2]/div/div"));

    //Проскроллить страницу чуть ниже и кликнуть на пункт «Управление бронированием».
    private SelenideElement scroll3 = $(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[1]/div/div[2]/div/div"));

    @Step("Проскроллить страницу к блоку поиска билета")
    public SelenideElement getScroll() {
        return scroll.scrollTo();
    }

   @Step("Проскроллить страницу к сделующему блоку")
    public SelenideElement getScroll2() {
        return scroll2.scrollTo();
    }

   @Step("Проскроллить страницу чуть ниже и кликнуть на пункт «Управление бронированием»")
    public SelenideElement getScroll3() {
        return scroll3.scrollTo();
    }
}
