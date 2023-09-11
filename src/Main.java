public class Main {

    public static void main (String [] args){
        System.out.println("===== Sistema Bancário =====");
            Conta contaMarina = new Conta();         //  inicializando variavel e declarando variavel tipo Conta

            contaMarina.depositar(2000, 'd');
            contaMarina.sacar(100,'s');
            contaMarina.depositar(200,'d');
            contaMarina.sacar(150,'s');
            contaMarina.depositar(300, 'd');
            contaMarina.imprimirExtrato();

            int totalContas = Conta.getTotalContas();
            int totalOperacoes = Operacao.getTotalOperacoes();

            double mediaOperacoes = totalOperacoes / totalContas;

            System.out.print("\n");
            System.out.println("Total de Contas: " + totalContas);
            System.out.println("Total de Operacoes: " + totalOperacoes);
            System.out.println("Media das Operacoes: " + mediaOperacoes);
    }
}

