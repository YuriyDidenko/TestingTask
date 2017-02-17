import PageObjects.Chapter1Page;
import PageObjects.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by ydidenko on 16.02.2017.
 */
public class ProvTest {

    @Test
    public void test() {

        HomePage homePage = open("http://book.theautomatedtester.co.uk/", HomePage.class);
        // mb check it?
        Chapter1Page chapter1Page = homePage.clickChapter1Link();
        // check it?
        $(By.xpath("//*")).shouldHave(text("Assert that this text is on the page"));
        chapter1Page.clickHomePageLink();
    }
}
