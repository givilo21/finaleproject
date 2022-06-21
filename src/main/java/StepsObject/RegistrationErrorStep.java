package StepsObject;

import PageObject.RegistrationErrorObject;
import io.qameta.allure.Step;

public class RegistrationErrorStep extends RegistrationErrorObject {
    @Step("errorin")
    public RegistrationErrorStep errori() {
        incomeerror.click();
        return this;
    }
    @Step("errorbtn")
    public RegistrationErrorStep errorRegi() {
        registratinerrorBtn.click();
        return this;
    }
    @Step("errorname")
    public RegistrationErrorStep Name(String username){
        registrationerrorName.setValue(username);
        return this;
    }
    @Step("clikerror")
    public RegistrationErrorStep Registr(){
        authorizationerror.click();
        return this;
    }
    @Step("finalerror")
    public RegistrationErrorStep login(){
        loginisnot.isDisplayed();
        return this;
    }

}