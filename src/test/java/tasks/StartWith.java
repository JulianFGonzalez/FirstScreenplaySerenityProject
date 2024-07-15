package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pages.TodoAppHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartWith implements Task {

    TodoAppHomePage todoAppHomePage;

    @Override
    @Step("{0} starts with an empty list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(todoAppHomePage));
    }

    public static StartWith anEmptyTodoList(){
        return instrumented(StartWith.class);
    }
}
