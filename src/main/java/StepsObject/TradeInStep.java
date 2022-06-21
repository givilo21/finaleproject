package StepsObject;

import PageObject.TradeIn;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class TradeInStep extends TradeIn {
    @Step("tradeInBtn")
    public TradeInStep tradebtn() {
        trade.click();
        sleep(6000);
        return this;
    }
    @Step("modelphone")
    public TradeInStep model() {
        phonemodel.click();
        return this;
    }
    @Step("memori")
    public TradeInStep memori() {
        memorioption.click();
        return this;
    }
    @Step("nextbtn")
    public TradeInStep pagene() {
        next.click();
        return this;
    }
    @Step("btn1")
    public TradeInStep mark() {
        btnone.click();
        return this;
    }
    @Step("nextbtn2")
    public TradeInStep shPageNe() {
        next.click();
        return this;
    }
    @Step("btn2")
    public TradeInStep markone() {
        btntwo.click();
        return this;
    }
    @Step("nextbtn3")
    public TradeInStep shpageTwo() {
        next.click();
        return this;
    }
    @Step("blokbtn")
    public TradeInStep blokBt() {
        btnblok.click();
        return this;
    }
    @Step("nextbtn4")
    public TradeInStep shpageTree() {
        next.click();
        return this;
    }
    @Step("blutoothBTN")
    public TradeInStep bluetooth() {
        conect.click();
        return this;
    }
    @Step("seePrice")
    public TradeInStep fine() {
        fineprice.click();
        return this;
    }
    @Step("finalPrice")
    public TradeInStep Price() {
        finalprice.getValue();
        sleep(5000);
        return this;
    }
}