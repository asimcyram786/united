package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hook.driver;

public class Footer_section {

    @FindBy(css = "#footerPanel0-panel a")
    private List<WebElement> footer_links;

    public List<WebElement> getFooter_links() {
        return footer_links;
    }

    public Footer_section (){


        PageFactory.initElements(driver,this);
    }
}


