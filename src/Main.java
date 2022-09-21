public class Main {
    public static void main(String[] args){

        double media;

        // Inicializacao Cliente

        Cliente jessica = new Cliente();
        Cliente objA = new Cliente();
        Cliente objB = new Cliente();

        jessica.nome = "Jéssica Alves";
        jessica.cpf = "123.455.789-11";
        jessica.endereco = "Rua Laranjeiras";
        jessica.idade = 21;
        jessica.sexo = 'f';

        Cliente pedro = new Cliente();

        pedro.nome = "Pedro Henrique";
        pedro.cpf = "111.222.333-44";
        pedro.endereco = "Rua Cerejeira";
        pedro.idade = 25;
        pedro.sexo = 'm';

        // inicialização Conta

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.setDono(jessica);
        minhaConta.setNumConta(1013);
        minhaConta.setLimite(4000);

        suaConta.setDono(pedro);
        suaConta.setNumConta(1212);
        suaConta.setLimite(20000);

        minhaConta.depositar(1500);
        minhaConta.sacar(1000);
        suaConta.depositar(2000);
        suaConta.sacar(200);

        System.out.println("--------------------- Extrato de Conta ----------------------");

        // impressão extrato

        minhaConta.imprimirExtrato();
        suaConta.imprimirExtrato();

        // impressão total contas e operações
        System.out.print("\n");
        System.out.println("--------------------- Contas e Operacoes ----------------------");

        System.out.println("Total Contas: " + Conta.totalContas);
        System.out.println("Total Operacoes: " + Operacao.totalOperacoes);
        media = Operacao.totalOperacoes / Conta.totalContas;
        System.out.println("Media: " + media);

    }
}