package StepsObject;

import PageObject.Kalata;
import io.qameta.allure.Step;

public class KalataStep extends Kalata {
    @Step("search")
    public Kalata searchbtn(){
        search.click();
        return this;
    }
    @Step("gazqura")
    public Kalata searchGS (String Name){
        search1.setValue(Name).pressEnter();
        return this;
    }
    @Step("quantity")
    public Kalata buysize(){
        buybtnsize.getSize();
        return this;
    }
    @Step("buybtn")
    public Kalata buy(){
        buybtn.click();
        return this;
    }
    @Step("kalata")
   public Kalata price(){
       kalatabuy.getValue();
      return this;
   }
}
