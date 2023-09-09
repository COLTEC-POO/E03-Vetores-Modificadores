import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("====Sistema Bancário====");
        // Chama a função regContas para criar as contas com base na entrada do usuário
        Conta[] contas = Conta.regContas();

        // Utilizando operacoes dentro do array
        contas[0].depositar(200);
        contas[0].sacar(2000);


        // Imprima o extrato da conta
        contas[0].imprimirExtrato();

        // Calcular a média de operações por conta
        double mediaOperacoesPorConta = (double) Operacao.getTotalOperacoes() / Conta.getNumdeContas();
        System.out.println("Mdia de operações por conta: " + mediaOperacoesPorConta);

    }
}
