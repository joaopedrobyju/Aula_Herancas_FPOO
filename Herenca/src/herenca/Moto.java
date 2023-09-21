package herenca;

public class Moto extends Veiculo{
    private String combustivel;
    private String tipoPartida;


    public Moto(String descricao, int ano, String cor, String modelo, String marca, double valor,
                boolean zeroKm, boolean freioAbs, CombustivelEnum combustivelEnum,
                PatidaEnum patidaEnum) {
        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioAbs);

        this.combustivel = combustivelEnum.getTipoCombustivel();
        this.tipoPartida = patidaEnum.getTipoPartida();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Moto{" +
                "combustivel='" + combustivel + '\'' +
                ", tipoPartida='" + tipoPartida + '\'' +
                '}';
    }
}
