package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ToDoList {
    public static Target WHAT_NEEDS_TO_BE_DONE = Target.the("'What needs to be done?' field").located(By.id("uniqName_0_0"));
    public static Target ITEMS = Target.the("List of todo items").locatedBy(".view label");
}
