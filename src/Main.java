public class Main {

    public static void main(String[] args){
        System.out.println("===Sistema Bancario===");

        Cliente clientePedro = new Cliente(
                "Pedro",
                341643421,
                "Rua Joao e Maria 223 BH, Minas Gerais",
                22,
                'M'
        );

        Conta contaPedro = new Conta(
                12344,
                "57457pedro",
                1000,
                clientePedro,
                2000
        );


        Cliente clienteJoao = new Cliente(
                "Joao",
                245938491,
                "Rua Sao Bernardo 18 RJ, Rio de Janeiro",
                25,
                'M'
        );
        Conta contaJoao = new Conta(
                43334,
                "3455joao",
                200,
                clienteJoao,
                4000
        );

        Conta c1 = new Conta(
                29298,
                "8328aa",
                0,
                clienteJoao,
                40000
        );

        c1.depositar(2500);
        c1.depositar(1500);
        c1.sacar(200);
        c1.sacar(3000);
        c1.depositar(150);
        c1.sacar(50);

        c1.imprimirExtrato();

        int totalContas = Conta.getTotalContas();
        int totalOperacoes = Operacao.getTotalOperacoes();

        double media = totalOperacoes / totalContas;


        System.out.println("Total de Contas no Sistema: "+ totalContas);
        System.out.println("Total de Operacoes no Sistema: " + totalOperacoes);
        System.out.println("Media: "+ media);

    }

}
