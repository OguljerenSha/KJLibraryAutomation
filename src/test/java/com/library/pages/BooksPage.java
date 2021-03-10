package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {

    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement recordsDropdown;

    public WebElement getValueFromRecordsDropDown(){
        Select select = new Select(recordsDropdown);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        return firstSelectedOption;
    }


}
