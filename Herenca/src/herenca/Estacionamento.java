package herenca;

public class Estacionamento {
    public static void main(String[] args) {

        Carro gol = new Carro("Gol Bolinha conservado",2000, "Preto",
                "Gol G2", "Wolkswagen", 15000, false, true,
                5, CambioEnum.MANUAL, CombustivelEnum.GASOLINA);

        System.out.println(gol);
    }
}
