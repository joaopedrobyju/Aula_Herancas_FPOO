package herenca;

public class Estacionamento {
    public static void main(String[] args) {

        Carro gol = new Carro("Gol Bolinha conservado",2000, "Preto",
                "Gol G2", "Wolkswagen", 15000, false, true,
                5, CambioEnum.MANUAL, CombustivelEnum.GASOLINA);

        System.out.println(gol);

        Moto hornet = new Moto("Moto Hornet 600 C", 2014, "Preto", "Hornet",
                "Honda", 40000, true, true,
                CombustivelEnum.GASOLINA, PatidaEnum.ELETRICA);

        System.out.println(hornet);
    }


}
