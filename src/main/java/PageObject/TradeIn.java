package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;


public class TradeIn {
    public SelenideElement
    trade = $(By.partialLinkText("Trade-In")),
    phonemodel = $(byValue("8")),
    memorioption = $(byText("128 Gb")),
    next = $(byText("შემდეგი")),
    btnone = $("#general8"),
    btntwo = $("#screen2"),
    btnblok = $("#body6"),
    conect = $("#network2"),
    fineprice = $(".js-wizard-get-price"),
    finalprice = $(".trade-in-price-block");

}

