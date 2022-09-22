
public class Main {

    public static void main(String[] args) {

        Conta contaMaria = new Conta();

        contaMaria.depositar(2500);
        contaMaria.depositar(1500);
        contaMaria.sacar(200);
        contaMaria.sacar(3000);
        contaMaria.depositar(150);
        contaMaria.sacar(50);

        contaMaria.extrato();


    }
}

