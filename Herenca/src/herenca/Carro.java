package herenca;

public class Carro {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(int qtdePortas, CambioEnum cambioEnum, String combustivel) {
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivel;
    }
}
