import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTests {

    @Test
    public void softAssertPageOnGitHub() {
        open("https://github.com/selenide/selenide");
        $("[data-content='Wiki']").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $x("//*[@class='d-block' and text()='SoftAssertions']").click();
        $x("//*[text()='Using JUnit5 extend test class:']/../following-sibling::div ").should(visible);
    }

    @Test
    public void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").should(text("A"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").should(text("B"));
    }

}
