//class main
public class Main {
    public static void main(String[] args) {

        ContaExtrato c1 = new ContaExtrato();

        c1.depositar1 = 500;
        c1.sacar1 = 200;
        c1.sacar2 = 3000;
        c1.depositar2 = 150;
        c1.sacar3 = 50;

        c1.imprimirExtrato();
    }
}

//class extrato
public class ContaExtrato {
    int depositar1;
    int depositar2;

    int sacar1;
    int sacar2;
    int sacar3;


    public void imprimirExtrato(){
        System.out.println(depositar1);
        System.out.println(depositar2);
        System.out.println(sacar1);
        System.out.println(sacar2);
        System.out.println(sacar3);

    }

}


