package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.BTN_buscar;

public class GoToSearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_buscar)
        );
    }
    public static GoToSearchTask on() {
        return new GoToSearchTask();
    }
}
