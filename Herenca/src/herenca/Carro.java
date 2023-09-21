package herenca;

public class Carro extends Veiculo {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(String descricao, int ano, String cor, String modelo, String marca, double valor,
                 boolean zeroKm, boolean freioAbs, int qtdePortas, CambioEnum cambioEnum,
                 CombustivelEnum combustivelEnum) {

        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioAbs);

        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivelEnum.getTipoCombustivel();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Carro{" +
                "qtdePortas=" + qtdePortas +
                ", modeloCambio='" + modeloCambio + '\'' +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
//    public Carro(int qtdePortas, CambioEnum cambioEnum, CombustivelEnum combustivelEnum) {
