package PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Realized to represent PageObject for Home Page
 */
public class HomePage {

    /**
     * Makes click on link with text "Chapter1"
     *
     * @return PageObject for Chapter1 page
     */
    public Chapter1Page clickChapter1Link() {
        $(By.xpath("//a[@href='/chapter1']")).click();
        return page(Chapter1Page.class);
    }
}
