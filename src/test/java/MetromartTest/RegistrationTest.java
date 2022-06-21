package MetromartTest;

import StepsObject.KalataStep;
import StepsObject.RegistrationErrorStep;
import StepsObject.RegistrationSteps;
import StepsObject.TradeInStep;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import runer.cromruner;

import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selenide.sleep;
@Listeners(Utils.TestLister.class)
public class RegistrationTest extends cromruner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("რეგისტრაცია")
    public void registration(){
        RegistrationSteps Steps = new RegistrationSteps();
        Steps
                .incomebtn()
                .gotoRagistrationPage()
                .gotoRagistrationName(username)
                .gotoRagistrationMail(email)
                .gotoRagistrationPhone(phone)
                .gotoRagistrationAutorization();
        Assert.assertTrue(Steps.authorization.is(Condition.not(Condition.empty)));
        sleep(9000);
    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("რეგისტრაცის ერორი")
    public void registrationerror(){
        RegistrationErrorStep steps = new RegistrationErrorStep();
        steps
                .errori()
                .errorRegi()
                .Name(username)
                .Registr();
        Assert.assertTrue(steps.loginisnot.is(Condition.not(Condition.empty)));



    }
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("კალათაში დამატება")
    public void inkalata (){
        KalataStep Steps = new KalataStep();
        SoftAssert soft = new SoftAssert();
        Steps
                .searchbtn();
        Steps
                .searchGS(Gname);
       soft.assertTrue(Steps.search.is(Condition.not(Condition.empty)));
        Steps
                .buysize();
        Steps
                .buy();
        soft.assertTrue(Steps.kalatabuy.isDisplayed());
        sleep(6000);


    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("phoneprice")
    public void trade(){
        SoftAssert soft = new SoftAssert();
        TradeInStep Steps = new TradeInStep();
        Steps
                .tradebtn()
                .model()
                .memori()
                .pagene()
                .mark()
                .shPageNe()
                .markone()
                .shpageTwo()
                .blokBt()
                .shpageTree()
                .bluetooth()
                 .fine();

        soft.assertTrue(Steps.finalprice.isDisplayed());

    }

}
