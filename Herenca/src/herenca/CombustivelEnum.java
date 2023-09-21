package herenca;

public enum CombustivelEnum {
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    DIESEL("Diesel"),
    GNV("Gás Natural Veicular");

    private String tipoCombustivel;

    private CombustivelEnum(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }
}
