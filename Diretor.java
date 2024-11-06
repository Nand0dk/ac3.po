// Classe Diretor, herda de FuncionarioBase e implementa a interface Beneficios
public class Diretor extends FuncionarioBase implements Beneficios {
    private double bonusPercentual; // Percentual de bônus do diretor
    private double auxilioMoradia; // Valor do auxílio-moradia do diretor

    // Construtor para inicializar o nome, salário base, percentual de bônus e
    // auxílio-moradia do diretor
    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    // Implementação do cálculo de salário, incluindo bônus e auxílio-moradia
    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia);
    }

    // Implementação do cálculo de bônus com base no percentual
    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }

    // Implementação do cálculo do auxílio-moradia com base no valor fixado
    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }
}
