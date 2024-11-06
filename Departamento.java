import java.util.ArrayList;

public class Departamento {

    private ArrayList<FuncionarioBase> funcionarios;

    public Departamento(String nome) {

        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    public double calcularFolhaPagamentoTotal() {
        double total = 0;
        for (FuncionarioBase funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    public void imprimirSalariosFuncionarios() {
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());
        }
    }
}
