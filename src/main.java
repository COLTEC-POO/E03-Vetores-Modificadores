import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class main {


    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem Vindo ao sistema Bancario");

        Conta contaJoao;
        Conta contaMaria;
        Cliente temp;

        temp = new Cliente("João", "15796345788", "Av Antonio Carlos, Coltec, Belo Horizonte MG", 33, "M");
        contaJoao = new Conta(temp , true, 500.00, 100.00, 6541 );
        temp = new Cliente ("Maria", "22222222222", "Av Antonio Carlos, Coltec, Belo Horizonte MG", 24, "F");
        contaMaria = new Conta(temp , true, 8422.00, 100.00, 9636);

        contaJoao.imprimirSaldo();
        contaMaria.imprimirSaldo();

        contaJoao.mostraConta();
        contaJoao.mostraConta(true);
        contaMaria.mostraConta();
        contaMaria.mostraConta(true);

        contaJoao.mostraExtrato();

        System.out.println("Quanto deseja transferir: ");
        Double valor = input.nextDouble();
        contaJoao.transferir(contaMaria, valor);
        
        contaJoao.imprimirSaldo();
        contaMaria.imprimirSaldo();

        contaJoao.mostraExtrato();

        contaJoao.depositar(2500.0,'d');
        contaJoao.depositar(1500.0, 'd');
        contaJoao.sacar(200.0,'s');
        contaJoao.sacar(3000.0,'s');
        contaJoao.depositar(150.0,'d');
        contaJoao.sacar(50.0,'s');

        contaJoao.mostraExtrato();

        System.out.println("Media de Operações: " + contaJoao.getMedia());

        input.close();
    }
}