package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationErrorObject {
    public SelenideElement
            incomeerror = $("#headerProfileContent"),
            registratinerrorBtn = $(byText("რეგისტრირება")),
            registrationerrorName = $("#registration-name"),
            registrationerrorMail = $("#registration-email"),
            registrationerrorPhone = $("#registration-phone"),
            loginisnot = $(byText("Login is not supplied")),
            authorizationerror = $(byText("გაგრძელება"));
}
