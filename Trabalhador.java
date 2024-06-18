// Objetivo: Criar uma interface Trabalhador e implementá-la na classe Funcionario.
// • Crie uma interface Trabalhador com um método trabalhar.
// • Implemente a interface Trabalhador na classe Funcionario.
// • Na implementação do método trabalhar, exiba uma mensagem indicando que o funcionário está trabalhando.
// • Atualize a classe Gerente para também implementar a interface Trabalhador.

public interface Trabalhador {
    void trabalhar();
}

public class Funcionario implements Trabalhador {
    protected double salario;
    protected String departamento;

    public Funcionario(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Salário: " + salario + ", Departamento: " + departamento);
    }

    @Override
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }
}

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salario, String departamento, double bonus) {
        super(salario, departamento);
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bônus: " + bonus);
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente está trabalhando.");
    }
}
