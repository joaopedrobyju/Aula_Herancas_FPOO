package herenca;

public class Scooter extends Veiculo{
    private int potenciaBateria;

    public Scooter(String descricao, int ano, String cor, String modelo, String marca,
                   double valor, boolean zeroKm, boolean freioAbs,
                   int potenciaBateria) {
        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioAbs);

        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Scooter{" +
                "potenciaBateria=" + potenciaBateria +
                '}';
    }
}
