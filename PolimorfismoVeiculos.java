// Exercício 10: Classe Abstrata
// Objetivo: Criar uma classe abstrata Veiculo e derivar subclasses Carro e Moto.
// • Crie uma classe abstrata Veiculo com um método abstrato mover.
// • Crie as classes Carro e Moto que herdem de Veiculo.
// • Implemente o método mover em ambas as classes, exibindo mensagens apropriadas para cada tipo de veículo.
// • Crie uma lista de objetos do tipo Veiculo e adicione objetos Carro e Moto na lista.
// • Itere sobre a lista e chame o método mover para cada objeto, demonstrando o polimorfismo.

import java.util.ArrayList;
import java.util.List;

abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro está se movendo.");
    }
}

class Moto extends Veiculo {
    @Override
    void mover() {
        System.out.println("A moto está se movendo.");
    }
}

public class PolimorfismoVeiculos {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        veiculos.add(carro);
        veiculos.add(moto);

        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
        }
    }
}
