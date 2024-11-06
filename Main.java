// Classe  para demonstrar o funcionamento das outras classes
public class Main {
    public static void main(String[] args) {

        Departamento departamento = new Departamento("Departamento");

        // Criação dos funcionários
        Funcionario joao = new Funcionario("João", 3000);
        Gerente maria = new Gerente("Maria", 5000, 20);
        Diretor carlos = new Diretor("Carlos", 10000, 30, 2000);

        // Adiciona funcionarios
        departamento.adicionarFuncionario(joao);
        departamento.adicionarFuncionario(maria);
        departamento.adicionarFuncionario(carlos);

        System.out.println("Folha de pagamento total: " + departamento.calcularFolhaPagamentoTotal());

        departamento.imprimirSalariosFuncionarios();
    }
}
