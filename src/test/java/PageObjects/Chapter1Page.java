package PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Realized to represent PageObject for Chapter1 page
 */
public class Chapter1Page {

    /**
     * Makes click on link with text "Home Page"
     *
     * @return PageObject for Home Page
     */
    public HomePage clickHomePageLink() {
        $(By.xpath("//a[@href='/']")).click();
        return page(HomePage.class);
    }

}
