// Classe Funcionario, representa um funcionário simples sem bônus ou benefícios extras
public class Funcionario extends FuncionarioBase {

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
