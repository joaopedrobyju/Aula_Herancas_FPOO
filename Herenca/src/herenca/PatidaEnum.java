package herenca;

public enum PatidaEnum {
    ELETRICA("Partida Elétrica"),
    MANUAL("Partida Pedal");

    private String tipoPartida;

    private PatidaEnum(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }
}
