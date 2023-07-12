package money.vivid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class VividMoneyTests extends VividMoneyTestBase {
    @Tag("remote")
    @Test
    void smokeVividMoneyMainPageTest() {


        SelenideElement bankingPopUp = $(".popupMenu__popupItemsChild__VU_Rm");


        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Navigate on Banking", () -> {
            $(byText("Banking")).hover()
                    .shouldBe(Condition.visible);
        });

        step("Check if Vivid Prime and Vivid Now are present", () -> {
            bankingPopUp.shouldHave(text("Vivid Prime"), text("Vivid Now"));
        });

        sleep(5000);
    }
}


