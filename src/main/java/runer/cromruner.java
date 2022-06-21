package runer;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class cromruner {
    @BeforeTest
    public void userclass() {

            Selenide.open("https://metromart.ge/ka_GE/");
            Configuration.browserSize = "1920x1080";
        }

    }


