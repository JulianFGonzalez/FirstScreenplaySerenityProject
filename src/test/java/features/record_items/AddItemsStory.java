package features.record_items;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import questions.TheTodoItems;
import tasks.AddATodoItem;
import tasks.StartWith;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.contains;


@ExtendWith(SerenityJUnit5Extension.class)
public class AddItemsStory {

    @CastMember(name="Julian")
    Actor julian;

    @Test
    public void shouldBeAbleToAddAnItemToTheList(){
        givenThat(julian).wasAbleTo(StartWith.anEmptyTodoList());
        when(julian).attemptsTo(AddATodoItem.called("Feed the cat"));
        then(julian).should(seeThat(TheTodoItems.displayed(),contains("Feed the cat")));
    }

}
