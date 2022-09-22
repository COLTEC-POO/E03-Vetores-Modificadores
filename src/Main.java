
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema bancário");

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o CPF:");
        String cpf = entrada.next();
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite o número da conta: ");
        int numConta = entrada.nextInt();
        System.out.println("Digite o saldo: ");
        double saldo = entrada.nextDouble();


        Conta conta1 = new Conta(nome,cpf, idade, numConta, saldo,saldo + saldo * 0.5);
        conta1.imprimir();
        System.out.println("Número de contas criadas = " + Conta.contadorNumContas);
        conta1.depositar(5000);
        conta1.sacar(300);
        conta1.extrato();
        System.out.println("Número de operações = " + Operacao.totalOperacoes);
    }
}