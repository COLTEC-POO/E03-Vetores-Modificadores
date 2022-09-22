public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema Bancário\n");

        Conta contaTeste = new Conta("Eduardo", 1201, "123456789-01", 10000, 20, 'm', "Belo Horizote");
        Conta contaTeste2 = new Conta("João", 1202, "123456789-01", 10000, 20, 'm', "Belo Horizote");

        contaTeste.imprimirSaldo();

        contaTeste.depositar(1200);
        contaTeste.depositar(1500.55);
        contaTeste.sacar(757);

        contaTeste.extrato();
        contaTeste2.extrato();
        
        contaTeste.imprimir();

        contaTeste.mediaOperacoes();
    }
}