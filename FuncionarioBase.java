// Classe abstrata base para todos os funcionários
public abstract class FuncionarioBase {
    protected String nome;
    protected double salarioBase;

    public abstract double calcularSalario();

    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }

    public String getNome() {
        return nome;
    }
}
