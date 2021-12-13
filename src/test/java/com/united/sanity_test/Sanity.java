package com.united.sanity_test;

import com.united.pages.*;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.Callable;

import static com.united.base.Hook.driver;

public class Sanity {
    @Given("click on English link")
    public void clickOnEnglishLink()  {
        Header_Page header_page = new Header_Page();
        WebElement english_link = header_page.getEnglish_link();
        Common.highlight_element(english_link);
        header_page.getEnglish_link().click();
        Common.waitUntil(2);
    }

    @Then("click on select option")
    public void clickOnSelectOption() {
        Language_tab popup_window_page = new Language_tab();
        WebElement language_selector_option = popup_window_page.getLanguage_selector_option();
        Common.highlight_element(language_selector_option);
        Common.waitUntil(2);
        popup_window_page.getLanguage_selector_option().click();
        Common.waitUntil(2);


    }

    @And("choose the language you want")
    public void chooseTheLanguageYouWant() throws InterruptedException {
        Language_tab languageTab = new Language_tab();
        for (WebElement language : languageTab.getDropDown_language()) {
            if (language.getAttribute("aria-label").equals("Deutsch")) {
                language.click();
                break;
            }
        }
        Thread.sleep(2000);
    }


    @And("click on change button")
    public void clickOnChangeButton() {
        Language_tab popup_window_page = new Language_tab();
        WebElement language_change_btn = popup_window_page.getLanguage_change_btn();
        Common.highlight_element(language_change_btn);
        Common.waitUntil(2);
        popup_window_page.getLanguage_change_btn().click();
        Common.waitUntil(3);
    }

    @Then("verify language is change on website")
    public void verifyLanguageIsChangeOnWebsite() {
        Header_Page header_page = new Header_Page();
        String text = header_page.getLanguage_change_verification().getText();
        Common.highlight_element(header_page.getLanguage_change_verification());
        Assert.assertTrue(text.contains("Deutsch"));
        Common.waitUntil(3);
    }

    @Given("click on book tab")
    public void clickOnBookTab() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getBook_link().click();
        Thread.sleep(2000);


    }

    @Then("verify travel text field display")
    public void verifyTravelTextFieldDisplay() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getTravel_text_field().isDisplayed();
        Thread.sleep(2000);
    }


    @And("click on flight status tab")
    public void clickOnFlightStatusTab() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getFlight_status_link().click();
        Thread.sleep(2000);
    }

    @And("verify flight number text field display")
    public void verifyFlightNumberTextFieldDisplay() throws InterruptedException {
        Travel_info_Page travel_info_page = new Travel_info_Page();
        travel_info_page.getFlight_number_text_field().isDisplayed();
        Thread.sleep(1500);
    }

    @And("click on check in tab")
    public void clickOnCheckInTab() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getCheckIn_tab().click();
        Thread.sleep(1000);


    }

    @Then("verify confirmation number display")
    public void verifyConfirmationNumberDisplay() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getConfirmation_text_field().isDisplayed();
        Thread.sleep(1000);
    }

    @And("click on my trips tab")
    public void clickOnMyTripsTab() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getMy_trip_tab().click();
        Thread.sleep(1000);

    }

    @Then("verify find your travel credits link clickable")
    public void verifyFindYourTravelCreditsLinkClickable() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getTravel_credit_link().click();
        Thread.sleep(2000);
    }


    @And("verify new tab open with main heading")
    public void verifyNewTabOpenWithMainHeading() throws InterruptedException {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getNew_tab_main_heading().isDisplayed();
        Thread.sleep(1500);
    }

    @Given("click on book link")
    public void clickOnBookLink() {
        Header_Page headerPage = new Header_Page();
        headerPage.getBook_link().click();
        Common.waitUntil(2);


    }

    @Then("verify all the links display")
    public void verifyAllTheLinksDisplay() {
        Header_Page headerPage = new Header_Page();
        headerPage.getBook_verify_links().isDisplayed();
        Common.waitUntil(2);
    }

    @And("click on my trips link")
    public void clickOnMyTripsLink() {
        Header_Page headerPage = new Header_Page();
        headerPage.getMy_trip_link().click();
        Common.waitUntil(2);
    }

    @Then("verify mange my trip and trip help text display")
    public void verifyMangeMyTripAndTripHelpTextDisplay() {
        Header_Page headerPage = new Header_Page();
        headerPage.getMy_trip_verify_link().isDisplayed();
        Common.waitUntil(2);
    }

    @And("click on travel info link")
    public void clickOnTravelInfoLink() {
        Header_Page headerPage = new Header_Page();
        headerPage.getTravel_info_link().click();
        Common.waitUntil(2);
    }

    @Then("verify all the link under planning and day traveling are display")
    public void verifyAllTheLinkUnderPlanningAndDayTravelingAreDisplay() {
        Header_Page headerPage = new Header_Page();
        headerPage.getTravel_info_verify_link().isDisplayed();
        Common.waitUntil(1);
    }

    @And("click on mileageplus link")
    public void clickOnMileageplusLink() {
        Header_Page headerPage = new Header_Page();
        headerPage.getMileage_plus_link().click();
        Common.waitUntil(2);
    }

    @Then("verify all the link uder that")
    public void verifyAllTheLinkUderThat() {
        Header_Page headerPage = new Header_Page();
        headerPage.getMileage_plus_link_verify().isDisplayed();
        Common.waitUntil(1);
    }

    @And("click on deals link")
    public void clickOnDealsLink() {
        Header_Page headerPage = new Header_Page();
        headerPage.getDeals_link().click();
        Common.waitUntil(2);
    }

    @Then("verify under officer and destination text all link display")
    public void verifyUnderOfficerAndDestinationTextAllLinkDisplay() {
        Header_Page headerPage = new Header_Page();
        headerPage.getDeal_verify_links().isDisplayed();
        Common.waitUntil(1);
    }

    @And("click on help link")
    public void clickOnHelpLink() {
        Header_Page headerPage = new Header_Page();
        headerPage.getHelp_link().click();
        Common.waitUntil(2);
    }

    @Then("verify all the link display")
    public void verifyAllTheLinkDisplay() {
        Header_Page headerPage = new Header_Page();
        headerPage.getHelp_verify_link().isDisplayed();
        Common.waitUntil(2);
    }

    @Given("go to home page and verify links")
    public void goToHomePageAndVerifyLinks() {
        Home_Page home_page = new Home_Page();
        home_page.getUS_entry_requirements_link().isDisplayed();
        home_page.getExcepted_travel_link().isDisplayed();
        home_page.getChanging_trip_link().isDisplayed();
        Common.waitUntil(2);

    }

    @Given("verify all the footer links are clickable")
    public void verifyAllTheFooterLinksAreClickable() {
        Footer_section footerSection = new Footer_section();
        List<WebElement> footer_links = footerSection.getFooter_links();
        for (WebElement Links : footer_links) {
            String text = Links.getAttribute("href");
            System.out.println(text);
            Assert.assertFalse(text.isEmpty());
        }
    }
}


