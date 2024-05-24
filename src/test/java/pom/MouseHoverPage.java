package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class MouseHoverPage {
    //Навести мышку на пункт «Информация».
    private SelenideElement mouse = $(By.xpath("//div/a[text() = 'Информация']"));

    @Step("Наведести мышку на пункт «Информация».")
    public SelenideElement getMouse() {
        return mouse.hover();
    }
}

