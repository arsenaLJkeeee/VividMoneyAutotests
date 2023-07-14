package money.vivid;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class VividMoneyTests extends VividMoneyTestBase {
    @Tag("remote")
    @Test
    void smokeVividMoneyMainPageTest() {

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        SelenideElement bankingPopUp = $(".popupMenu__popupItemsChild__VU_Rm");
        SelenideElement investPopUp = $(".popupMenu__popupContent___tvDX.popupMenu__open__BPaxm");
        SelenideElement sendMessageTextArea = $(".styles__textarea__nSdTR");
        String textMessageFromVladimir = "Hello, i'm Vladimir";
        String emailFromVladimir = "arsenaljkeeee10@gmail.com";
        SelenideElement emailElement = $("input[type='email']");


        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Navigate on Banking", () -> {
            $(byText("Banking")).hover()
                    .shouldBe(visible);
        });

        step("Check if Vivid Prime and Vivid Now are present", () -> {
            bankingPopUp.shouldHave(text("Vivid Prime"), text("Vivid Now"));
        });

        step("Navigate on Invest", () -> {
            $(byText("Invest")).hover()
                    .shouldBe(visible);
        });

        step("Check if Crypto and Catalog are present", () -> {
            investPopUp.shouldHave(text("Crypto"), text("Catalog"));
        });

        step("Navigate on Rewards", () -> {
            $(byText("Rewards"))
                    .shouldBe(visible)
                    .hover();
        });

        step("Click on Business", () -> {
            $(byText("Business"))
                    .shouldBe(visible)
                    .click();
        });

        step("Send message into textarea", () -> {
            sendMessageTextArea
                    .setValue(textMessageFromVladimir);
        });

        step("Accept cookies", () -> {
            $(byText("Accept"))
                    .shouldBe(visible)
                    .click();
        });


        step("Send email into email input", () -> {
            Selenide.executeJavaScript("arguments[0].value = arguments[1]", emailElement, emailFromVladimir);
        });


        sleep(50000);
    }
}


