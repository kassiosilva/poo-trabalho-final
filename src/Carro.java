public class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;
    private int quilometragem;

    private Motor motor;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this(marca, modelo, ano);
        this.motor = motor;
    }

    public void rodar(int quilometragem) {
        if (quilometragem < 0) {
            return;
        }

        this.quilometragem += quilometragem;
    }

    public void exibirCarroInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void ligar() {
        System.out.println("Ligando carro ...");
        System.out.println(motor);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }
}
