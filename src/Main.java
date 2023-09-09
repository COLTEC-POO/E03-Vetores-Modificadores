public class Main {

    public static void main(String[] args) {

        Conta clienteDuque = new Conta(
                1,
                "222",
                3500,
                "Duque",
                2000
        );

        clienteDuque.depositar(200);
        clienteDuque.sacar(3700);

        clienteDuque.dadosBanc();
        System.out.println();
        clienteDuque.extrato();
    }
}
