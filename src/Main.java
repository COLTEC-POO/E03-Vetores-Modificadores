//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Sistema Bancario.");

        Conta contaErick = new Conta();
        Conta contaTata = new Conta();

        contaTata.getDono().setNome("Tata Linda");
        contaTata.setNumConta(30220353);
        contaTata.setLimite(200.0);
        contaTata.getDono().setEnd("pintor renato lima 2algumacoisa7");
        contaTata.getDono().setCpf("03215479862");
        contaTata.getDono().setSexo('f');
        contaTata.getDono().setIdade(19);

        contaTata.depositar(30);
        contaTata.depositar(150);
        contaTata.sacar(20);
        contaTata.sacar(47);
        contaTata.depositar(30);



        System.out.println("\n\n");

        contaTata.imprimeExtrato();

    }
}
