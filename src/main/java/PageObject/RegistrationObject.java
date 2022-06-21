package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationObject {
    public SelenideElement
     income = $("#headerProfileContent"),
    registratinBtn = $(byText("რეგისტრირება")),
    registrationName = $("#registration-name"),
    registrationMail = $("#registration-email"),
    registrationPhone = $("#registration-phone"),
    authorization = $(byText("გაგრძელება"));



}
