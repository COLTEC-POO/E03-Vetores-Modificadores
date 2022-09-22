import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta contaUm = new Conta();
        contaUm.depositar(1500);
        contaUm.sacar(500);

        Conta contaDois = new Conta();
        contaDois.depositar(3000);
        contaDois.sacar(1000);


        contaDois.tranferencia(contaUm, 500);

        contaUm.imprimirExtratoDetalhado();
        contaDois.imprimirExtratoDetalhado();

        System.out.println("\nA media de operações por conta criada é: " + (contaUm.nOperacoesRealizadas()/contaUm.getNumContasCriadas()));
    }
}
