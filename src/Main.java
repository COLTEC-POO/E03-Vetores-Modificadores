public class Main {
    public static void main(String[] args){
        double media;
        Conta minhaConta = new Conta();
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.depositar(2500);
        c1.depositar(1500);
        c1.sacar(200);
        c1.sacar(3000);
        c1.depositar(150);
        c1.sacar(50);

        c1.imprimirExtrado();
        media= Operacao.totalOperacoes/Conta.totalContas;
        System.out.println(media);



    }
}
