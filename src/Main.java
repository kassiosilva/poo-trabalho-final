public class Main {
    public static void main(String[] args) {
        System.out.println("--- Questão 1 ---");
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023);
        meuCarro.exibirCarroInfo();

        System.out.println("\n--- Questão 2 ---");
        meuCarro.rodar(100);
        meuCarro.rodar(-100);
        meuCarro.rodar(50);
        meuCarro.rodar(73);
        meuCarro.rodar(122);
        meuCarro.rodar(-3);

        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

        System.out.println("\n--- Questão 3 ---");
        MeuCarroEsportivo carroEsportivo = new MeuCarroEsportivo("Chevrolet", "Camaro", 2020);
        carroEsportivo.setVelocidadeMaxima(330);
        carroEsportivo.acelerar();
        System.out.println(carroEsportivo);
        carroEsportivo.setVelocidadeMaxima(80);
        System.out.println(carroEsportivo);

        System.out.println("\n--- Questão 4 ---");
        Motor motorCarro = new Motor("V8", 500);
        Carro meuCarroComMotor = new Carro("Chevrolet", "Camaro", 2020, motorCarro);
        meuCarroComMotor.ligar();

    }
}
