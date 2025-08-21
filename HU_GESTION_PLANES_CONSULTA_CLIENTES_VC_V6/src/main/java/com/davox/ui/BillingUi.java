package com.davox.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BillingUi {
    public static final Target TXT_redireccionPaginafacturacion = Target.the("I am in the billing page")
            .located(By.cssSelector("div[class=\"subtitulo\"] p"));
    public static final Target BTN_mantenimientoPlanesVozCorporativa = Target.the("Click on the maintenance vox")
            .located(By.xpath("//mat-list-item[contains(., 'Mantenimiento planes voz corporativa')]"));
}
