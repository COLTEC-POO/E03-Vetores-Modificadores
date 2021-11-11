public class Main {

    public static void main (String [] args){

        double media = 0;

        Cliente jessica = new Cliente();
        jessica.nome = "Jéssica";
        jessica.cpf = "122.553.255-42";
        jessica.endereco = "Rua Filadelfia, 32";
        jessica.idade = 19;
        jessica.sexo = 'F';

        Cliente felipe = new Cliente();
        felipe.nome = "Felipe";
        felipe.cpf = "142.608.146-65";
        felipe.endereco = "Rua Margarida, 176";
        felipe.idade = 32;
        felipe.sexo = 'M';

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.setDono(jessica);
        minhaConta.setNumero(456);
        minhaConta.setLimite(5000.0);

        suaConta.setDono(felipe);
        suaConta.setNumero(789);
        suaConta.setLimite(3000.0);

        minhaConta.depositar(100);
        minhaConta.tranferir(suaConta,10);
        suaConta.depositar(50);
        suaConta.depositar(100);

        media = Operacao.totalOperacoes / Conta.totalContas;

        System.out.println("Total Contas = " + Conta.totalContas);
        System.out.println("Total Operações = " + Operacao.totalOperacoes);
        System.out.println("Média = " + media);

        minhaConta.imprimirExtrato();

    }
}