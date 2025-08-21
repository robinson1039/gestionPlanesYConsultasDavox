package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;

import static com.davox.ui.BillingUi.*;

public class BillingTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_mantenimientoPlanesVozCorporativa)
        );
    }

    public static BillingTask on (){
        return new BillingTask();
    }
}
