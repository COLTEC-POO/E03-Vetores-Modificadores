
public class Main {

    public static void main (String[] args){

        Cliente userVicente = new Cliente("Vicente do Carmo", "777-777-777.77", "Rua ABC, 123", 24, 'M');
        Conta contaVicente = new Conta(69420, userVicente, 100.00, 500.00); 

        Cliente userSilvana = new Cliente("Silvana Mara", "888-888-888.88", "Rua CDE, 456", 61, 'F');
        Conta contaSilvana = new Conta(196223, userSilvana, 5000.00, 10000.00);


        contaSilvana.depositar(2000); 
        contaSilvana.depositar(1000);
        contaSilvana.sacar(500);
        contaSilvana.depositar(100);
        contaSilvana.sacar(-100000);   // Testes para ver se o contador de operações não contabiliza erros

        contaSilvana.extrato();

        contaVicente.depositar(500);
        contaVicente.depositar(1000);
        contaVicente.sacar(40);
        contaVicente.depositar(10);
        contaVicente.sacar(400);
        contaVicente.depositar(-1000);      // Testes para ver se o contador de operações não contabiliza erros

        contaVicente.extrato();

        System.out.println("Número de contas: " +  Conta.totalContas);
        System.out.println("Total de operações realizadas: " + Operacao.totalOperacoes);

        double media = (Operacao.totalOperacoes / Conta.totalContas);

        System.out.println("Média de operações por conta: " + media);
    }
}