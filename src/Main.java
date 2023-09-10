public class Main {

    public static void main(String[] args) {
        System.out.println("---Sistema Bancario---");

        Cliente clienteLeandro = new Cliente(
                "Leandro",
                14523100,
                "Concordia",
                22,
                'M'
        );

        Conta contaLeandro = new Conta(
                12289,
                "123teste",
                1748.5,
                clienteLeandro,
                2000
        );

        Cliente clienteThiago = new Cliente (
                "Thiago",
                14578921,
                "Espirito Santo",
                29,
                'M'

        );

        Conta contaThiago = new Conta(
                122891,
                "teste123",
                5847.1,
                clienteThiago,
                6847
        );

        Conta c1 = new Conta(
                1234,
                "1234teste",
                0,
                clienteThiago,
                10001
        );

        c1.depositar(4000);
        c1.depositar(20000);
        c1.sacar(1000);
        c1.sacar(3050);
        c1.depositar(203);
        c1.sacar(75);

        c1.imprimir_extrato();

        int total_contas = Conta.getTotal_contas();
        int total_operacoes = Operacao.getTotalOperacoes();

        double media = total_operacoes / total_contas;

        System.out.println("Total de contas: " + total_contas);
        System.out.println("Total de operacoes: " + total_operacoes);
        System.out.println("Media: " + media);
    }
}