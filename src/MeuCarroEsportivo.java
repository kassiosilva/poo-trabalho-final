public class MeuCarroEsportivo extends Carro {
    private int velocidadeMaxima;

    public MeuCarroEsportivo(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Velocidade máxima: " + velocidadeMaxima;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro esportivo!");
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
