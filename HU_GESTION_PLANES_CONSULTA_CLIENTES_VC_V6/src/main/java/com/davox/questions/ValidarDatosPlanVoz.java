package com.davox.questions;

import com.davox.models.QuerysDb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.davox.models.PlanVozCorporativo;

public class ValidarDatosPlanVoz implements Question<Boolean> {

    private final PlanVozCorporativo esperado;
    private final String codigoPlan;

    public ValidarDatosPlanVoz(PlanVozCorporativo esperado, String codigoPlan) {
        this.esperado = esperado;
        this.codigoPlan = codigoPlan;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        PlanVozCorporativo actual = QuerysDb.obtenerDatosDelPlan(codigoPlan);
        return actual != null &&
                actual.getDescripcion().equals(esperado.getDescripcion()) &&
                actual.getTipoPlan().equals(esperado.getTipoPlan()) &&
                actual.getUnidadesIncluidas().equals(esperado.getUnidadesIncluidas()) &&
                actual.getCargoFijo().equals(esperado.getCargoFijo()) &&
                actual.getValorMinLdnIncluido().equals(esperado.getValorMinLdnIncluido()) &&
                actual.getValorMinLdiIncluido().equals(esperado.getValorMinLdiIncluido()) &&
                actual.getValorMinLeIncluido().equals(esperado.getValorMinLeIncluido()) &&
                actual.getValorMinLdnAdicional().equals(esperado.getValorMinLdnAdicional()) &&
                actual.getValorMinLdiAdicional().equals(esperado.getValorMinLdiAdicional()) &&
                actual.getValorMinLeAdicional().equals(esperado.getValorMinLeAdicional());

    }
    public static ValidarDatosPlanVoz con(PlanVozCorporativo esperado, String codigoPlan) {
        return new ValidarDatosPlanVoz(esperado, codigoPlan);
    }
}
