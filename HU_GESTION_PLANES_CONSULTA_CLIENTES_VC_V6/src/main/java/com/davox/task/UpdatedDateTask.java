package com.davox.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.*;

public class UpdatedDateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_acepatarErrorMassgeDate),
                Click.on(BTN_fechaInicial),
                Click.on(BTN_nextMonth),
                Click.on(BTN_changeDate),
                Click.on(BTN_agregar)
        );
    }

    public static UpdatedDateTask on (){
        return new UpdatedDateTask();
    }
}
