package money.vivid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class VividMoneyTests extends VividMoneyTestBase {
    @Tag("remote")
    @Test
    void smokeVividMoneyMainPageTest() {


        SelenideElement bankingPopUp = $(".popupMenu__popupItemsChild__VU_Rm");
        SelenideElement investPopUp = $(".popupMenu__popupContent___tvDX.popupMenu__open__BPaxm");
        SelenideElement phoneInput = $("#invite-tab-PHONE");
        //String eMail = "arsenaljkeeee10@gmail.com";
        String phoneNumber = "+998597078392";


        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Navigate on Banking", () -> {
            $(byText("Banking")).hover()
                    .shouldBe(Condition.visible);
        });

        step("Check if Vivid Prime and Vivid Now are present", () -> {
            bankingPopUp.shouldHave(text("Vivid Prime"), text("Vivid Now"));
        });

        step("Navigate on Invest", () -> {
            $(byText("Invest")).hover()
                    .shouldBe(Condition.visible);
        });

        step("Check if Crypto and Catalog are present", () -> {
            investPopUp.shouldHave(text("Crypto"), text("Catalog"));
        });

        step("Navigate on Rewards", () -> {
            $(byText("Rewards"))
                    .shouldBe(Condition.visible)
                    .hover();
        });

        step("Click on Business", () -> {
            $(byText("Business"))
                    .shouldBe(Condition.visible)
                    .click();
        });


        step("Click on Get started", () -> {
            $(byText("Get started"))
                    .click();
        });

        step("Set Phone", () -> {
            phoneInput
                    .setValue(phoneNumber);

        });

        step("Click on Invite me!", () -> {
            $(byText("Invite me!"))
                    .shouldBe(Condition.visible)
                    .click();
        });

        step("Check Сongrats message", () -> {
            $("#invite-success-message")
                    .shouldBe(visible, Duration.ofSeconds(5))
                    .shouldHave(text("Congrats"));
        });

        sleep(5000);
    }
}


