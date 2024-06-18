// Exercício 5: Criando uma Classe com Atributos Protegidos
// Objetivo: Criar uma classe Funcionario com atributos protegidos e derivar uma subclasse Gerente.
// • Crie uma classe Funcionario com atributos protegidos salario (double) e departamento (String).
// • Adicione um método exibirInformacoes na classe Funcionario para exibir as informações.
// • Crie uma subclasse Gerente que herde de Funcionario.
// • Adicione um atributo privado bonus (double) na classe Gerente.
// • Crie um construtor que inicialize os atributos de Funcionario e Gerente.

public class Funcionario {
    protected double salario;
    protected String departamento;

    public Funcionario(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Salário: " + salario + ", Departamento: " + departamento);
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
}
