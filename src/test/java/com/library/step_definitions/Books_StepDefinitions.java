package com.library.step_definitions;

import com.library.pages.BooksPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Books_StepDefinitions {

    @Then("student should see dropdown value as {string}")
    public void student_should_see_dropdown_value_as(String string) {
        BooksPage booksPage = new BooksPage();
        WebElement valueFromRecordsDropDown = booksPage.getValueFromRecordsDropDown();
        String valueAsText = valueFromRecordsDropDown.getText();

        Assert.assertEquals(string, valueAsText);

    }

}
