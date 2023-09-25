public class Motor {
    private final String tipo;
    private final int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor: " + tipo + ", " + "Potência: " + potencia + " HP";
    }
}
