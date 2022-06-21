package StepsObject;

import PageObject.RegistrationObject;
import io.qameta.allure.Step;

public class RegistrationSteps extends RegistrationObject {
    @Step("in")
    public RegistrationSteps incomebtn(){
        income.click();
        return this;
    }
    @Step("registrationbtn")
    public RegistrationSteps gotoRagistrationPage(){
        registratinBtn.click();
        return this;
    }
    @Step("name")
    public RegistrationSteps gotoRagistrationName(String Name){
        registrationName.setValue(Name);
        return this;
    }
    @Step("mail")
    public RegistrationSteps gotoRagistrationMail(String Mail){
        registrationMail.setValue(Mail);
        return this;
    }
    @Step("phone")
    public RegistrationSteps gotoRagistrationPhone(String Phone){
        registrationPhone.setValue(Phone);
        return this;
    }
    @Step("authorizationbtn")
    public RegistrationSteps gotoRagistrationAutorization(){
        authorization.click();
        return this;
    }
}
