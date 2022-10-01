public class Main {
    
    public static void main(String[] args) {
        
        Conta contaGabi;

        contaGabi = new Conta();
        contaGabi.Cliente.nome= "Gabriella";
        contaGabi.numConta = 0030;
        contaGabi.Cliente.cpf = "439.354.876-23";
        contaGabi.limite = 5000.00;
        contaGabi.saldo = 3420.00;
        contaGabi.Cliente.endereco = "Rua Alta, 200 - Baixo";
        contaGabi.Cliente.idade = 19;
        contaGabi.Cliente.sexo = 'F';

        contaGabi.Cliente.imprimirDadosCliente();
        contaGabi.imprimirInfo();

        contaGabi.sacar(200);
        System.out.println("Saldo após saque: "+ contaGabi.saldo);

        contaGabi.depositar(1500);
        System.out.println("\nSaldo após depósito: " + contaGabi.saldo);

        contaGabi.depositar(2500);
        contaGabi.depositar(1500);
        contaGabi.sacar(200);
        contaGabi.sacar(3000);
        contaGabi.depositar(150);
        contaGabi.sacar(50);

        contaGabi.imprimirExtrato();
    }
}