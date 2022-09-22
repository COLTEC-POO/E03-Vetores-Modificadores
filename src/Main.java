public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema Bancário");

        Conta contaEduardo = new Conta("Contaldo",1201,"123456789",true);
        Conta contaGabriel = new Conta("DINIZ",1200,"123456789",true);

        contaEduardo.depositar(1200);

        contaEduardo.transferir(contaGabriel, 500);


        contaEduardo.imprimirSaldo();
        contaGabriel.imprimirSaldo();

        contaEduardo.depositar(500);
        contaEduardo.extrato();
    }
}