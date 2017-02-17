package PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by ydidenko on 16.02.2017.
 */
public class HomePage {

    public Chapter1Page clickChapter1Link() {
        $(By.xpath("//a[@href='/chapter1']")).click();
        return page(Chapter1Page.class);
    }
}
