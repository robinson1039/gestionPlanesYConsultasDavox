package com.davox.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.davox.ui.CorporateVoiceMaintenancePlansUi.TXT_Success;

public class PlanVozEnvioExitodoQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        // Espera hasta que el mensaje sea visible
        WebElementFacade mensaje = TXT_Success.resolveFor(actor);
        mensaje.waitUntilVisible().waitUntilPresent();
        String rawText = mensaje.getText().trim();

        // Solo toma el texto antes del signo "!", si existe
        if (rawText.contains("!")) {
            return rawText.split("!")[0].trim();
        }
        return rawText;
    }

    public static PlanVozEnvioExitodoQuestion value() {
        return new PlanVozEnvioExitodoQuestion();
    }
}
