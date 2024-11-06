// Classe Gerente
public class Gerente extends FuncionarioBase implements Beneficios {
    private double bonusPercentual; // Percentual do bônus do gerente

    public Gerente(String nome, double salarioBase, double bonusPercentual) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonusPercentual = bonusPercentual;
    }

    // cálculo de salário
    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual);
    }

    // cálculo de bônus
    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }

    // não possui auxílio-moradia
    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 0;
    }
}
