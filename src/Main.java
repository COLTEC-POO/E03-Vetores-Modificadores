public class Main {
        public static void main (String [] args) {

            double media;

            Conta minhaConta;
            minhaConta = new Conta ();

            Conta novaConta;
            novaConta = new Conta ();

            Cliente brenda;
            brenda = new Cliente ();

            Cliente novoCliente;
            novoCliente = new Cliente ();

            minhaConta.setDono(brenda);
            minhaConta.setNumeroDaConta(101);
            minhaConta.setLimite(10000);

            brenda.nome = "Brenda Sales";
            brenda.idade = 24;
            brenda.sexo = 'F';
            brenda.CPF = "000.000.000-00";
            brenda.endereco = "Rua X, bairro Y.";

            novaConta.setDono(novoCliente);
            novaConta.setNumeroDaConta(202);
            novaConta.setLimite(20000);

            novoCliente.nome = "Novo Cliente";
            novoCliente.idade = 24;
            novoCliente.sexo = 'M';
            novoCliente.CPF = "111.111.111-11";
            novoCliente.endereco = "Rua Y, bairro X.";

            minhaConta.imprimir(minhaConta);
            System.out.println ("------------------------------------------");
            minhaConta.imprimir(novaConta);
            System.out.println ("------------------------------------------");

            minhaConta.depositar(5000);
            System.out.println ("Saldo atual: R$ " + minhaConta.getSaldo());
            minhaConta.sacar(1000);
            System.out.println ("Saldo atual: R$ " + minhaConta.getSaldo());
            minhaConta.transferir(novaConta, 2000);
            System.out.println ("Saldo atual conta de origem: R$ " + minhaConta.getSaldo());
            System.out.println ("Saldo atual conta de destino: R$ " + novaConta.getSaldo());

            System.out.println ("------------------------------------------");
            minhaConta.imprimirExtrato();
            System.out.println ("------------------------------------------");

            media = Operacao.totalOperacoes / Conta.totalDeContas;
            System.out.println("Media do numero de operações em relação ao numero de contas: " + media);

        }
}
