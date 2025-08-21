package com.davox.models;

public class PlanVozCorporativo {
    private String codPlan;
    private String descripcion;
    private String tipoPlan;
    private String unidadesIncluidas;
    private String cargoFijo;
    private String valorMinLdnIncluido;
    private String valorMinLdiIncluido;
    private String valorMinLeIncluido;
    private String valorMinLdnAdicional;
    private String valorMinLdiAdicional;
    private String valorMinLeAdicional;

    public PlanVozCorporativo(String codPlan, String descripcion, String tipoPlan,String unidadesIncluidas, String cargoFijo,
                              String valorMinLdnIncluido, String valorMinLeIncluido, String valorMinLdiIncluido,
                              String valorMinLdnAdicional, String valorMinLeAdicional, String valorMinLdiAdicional) {
        this.codPlan = codPlan;
        this.descripcion = descripcion;
        this.tipoPlan = tipoPlan;
        this.unidadesIncluidas = unidadesIncluidas;
        this.cargoFijo = cargoFijo;
        this.valorMinLdnIncluido = valorMinLdnIncluido;
        this.valorMinLeIncluido = valorMinLeIncluido;
        this.valorMinLdiIncluido = valorMinLdiIncluido;
        this.valorMinLdnAdicional = valorMinLdnAdicional;
        this.valorMinLeAdicional = valorMinLeAdicional;
        this.valorMinLdiAdicional = valorMinLdiAdicional;
    }

    public String getCodPlan() { return codPlan; }
    public String getDescripcion() { return descripcion; }
    public String getTipoPlan(){return  tipoPlan;}
    public String getUnidadesIncluidas() { return unidadesIncluidas; }
    public String getCargoFijo() { return cargoFijo; }
    public String getValorMinLdnIncluido() { return valorMinLdnIncluido; }
    public String getValorMinLdiIncluido() { return valorMinLdiIncluido; }
    public String getValorMinLeIncluido() { return valorMinLeIncluido; }
    public String getValorMinLdnAdicional() { return valorMinLdnAdicional; }
    public String getValorMinLdiAdicional() { return valorMinLdiAdicional; }
    public String getValorMinLeAdicional() { return valorMinLeAdicional; }
}
