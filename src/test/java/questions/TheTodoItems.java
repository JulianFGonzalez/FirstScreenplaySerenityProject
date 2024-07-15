package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pages.ToDoList;

import java.util.Collection;
import java.util.List;

public class TheTodoItems implements Question<Collection<String>> {

    @Override
    public Collection<String> answeredBy(Actor actor) {
        return actor.asksFor(Text.ofEach(ToDoList.ITEMS));

    }

    public static Question<Collection<String>> displayed(){
        return new TheTodoItems();
    }
}
