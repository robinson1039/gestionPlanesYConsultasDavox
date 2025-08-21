package com.davox.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CorporateVoiceMaintenancePlansUi {
    public static final Target BTN_buscar = Target.the("click on search button")
            .located(By.cssSelector("div[class=\"mat-tab-label mat-ripple ng-star-inserted\"]"));
    public static final Target BTN_guardarCambios = Target.the("click on save changed")
            .located(By.id("button[class=\"mat-raised-button mat-primary\"]"));
    public static final Target BTN_acepatarErrorMassgeDate = Target.the("click on save changed")
            .located(By.cssSelector("button[class*=\"boton-ok\"]"));
    public static final Target BTN_nextMonth = Target.the("click on next month")
            .located(By.cssSelector("button[aria-label=\"Next month\"]"));
    public static final Target TXT_ErrorActualizacion = Target.the("Error message")
            .located(By.cssSelector("h1[class=\"mat-dialog-title titulo-error\"]"));
    public static final Target TXT_CorporateVoiceMaintenancePlans = Target.the("validate the h3 Corporate Voice Maintenance Plans")
            .located(By.cssSelector("h3"));
    public static final Target BTN_fechaInicial = Target.the("Click to open calendar")
            .located(By.cssSelector("[formcontrolname=\"fechaInicial\"]"));
    public static final Target BTN_changeDate = Target.the("set other day in the calendar")
            .located(By.cssSelector("tbody[class=\"mat-calendar-body\"] > tr > td:nth-child(2)"));
    public static final Target TXT_CodigoPlan = Target.the("insert the plan code")
            .located(By.cssSelector("input[placeholder=\"Código plan\"]"));
    public static final Target TXT_Descripcion = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Descripcion\"]"));
    public static final Target BTN_tipoPlan = Target.the("Open menu type of plan")
            .located(By.id("mat-select-0"));
    public static final Target BTN_opcionDinero = Target.the("click on money option ")
            .located(By.id("mat-option-6"));
    public static final Target TXT_UnidadesIncluidas = Target.the("insert the unit")
            .located(By.cssSelector("input[placeholder=\"Unidades Incluidas\"]"));
    public static final Target TXT_CargoFijo = Target.the("insert the Cargo Fijo")
            .located(By.cssSelector("input[placeholder=\"Cargo Fijo\"]"));
    public static final Target TXT_ValorMinutoLdnIncluido = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Valor Minuto Ldn Incluido\"]"));
    public static final Target TXT_ValorMinutoLdiIncluido = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Valor Minuto Ldi Incluido\"]"));
    public static final Target TXT_ValorMinutoLeIncluido = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Valor Minuto Le Incluido\"]"));
    public static final Target TXT_ValorMinutoLdnAdicional = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Valor Minuto Ldn Adicional\"]"));
    public static final Target TXT_ValorMinutoLdiAdicional = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Valor Minuto Ldi Adicional\"]"));
    public static final Target TXT_ValorMinutoLeAdicional = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Valor Minuto Le Adicional\"]"));
    public static final Target TXT_PlanHomologoAltamira = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Plan Homólogo Altamira\"]"));
    public static final Target TXT_BonoAltamira = Target.the("insert the description")
            .located(By.cssSelector("input[placeholder=\"Bono Altamira\"]"));
    public static final Target BTN_agregar = Target.the("Click on add plan")
            .located(By.cssSelector("button[class=\"mat-raised-button mat-primary\"]"));
    public static final Target TXT_Success = Target.the("see the success message")
            .located(By.cssSelector("[class=\"texto-mensaje\"]"));
    public static final Target BTN_aceptar = Target.the("click con accept button")
            .located(By.cssSelector("div[class*=\"mat-dialog-actions\"] button"));
    public static final Target BTN_llenarFormulario = Target.the("click on search id")
            .located(By.cssSelector("tbody  tr:nth-last-child(1) td[mattooltip=\"Hacer clic para editar información.\"] "));
}
