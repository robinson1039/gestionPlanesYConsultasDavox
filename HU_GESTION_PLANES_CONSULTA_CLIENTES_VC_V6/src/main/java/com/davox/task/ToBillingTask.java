package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.davox.ui.HomePageUi.*;

public class ToBillingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_basics),
                Click.on(BTN_billing)
        );
    }

    public static ToBillingTask on (){
        return new ToBillingTask();
    }
}
