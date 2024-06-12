import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando cliente
        Cliente diego = new Cliente();
        diego.setNome("Diego");

        // Criando contas
        Conta cc = new ContaCorrente(diego);
        Conta poupanca = new ContaPoupanca(diego);

        // Realizando operações
        cc.depositar(100);
        cc.transferir(100, poupanca);

        // Imprimindo extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Imprimindo histórico de transações
        System.out.println("Histórico de transações da conta corrente:");
        cc.imprimirHistoricoTransacoes();
        System.out.println("Histórico de transações da conta poupança:");
        poupanca.imprimirHistoricoTransacoes();

        // Testando o método listarClientes() da classe Banco
        Banco banco = new Banco();
        banco.setNome("Banco XYZ");
        banco.setContas(List.of(cc, poupanca));
        System.out.println("Clientes do banco:");
        banco.listarClientes();
    }
}
