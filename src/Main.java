public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Matheus Roberto", "123.456.789-09", "Rua sei lán, 500", 21, 'M');
        Client client2 = new Client("Ana Carolina", "987.654.321-98", "Rua não sei lá, 666", 18, 'F');
        Client client3 = client1;

        Account account1 = new Account(client1, 0.0, 500, 1);
        Account account2 = new Account(client2, 500, 500, 2);

        account1.deposit(100.0);
        account1.withdraw(250.0);

        account1.printInfo();

        account2.deposit(700.0);
        account2.withdraw(250.0);

        account2.printInfo();

        if (client1 == client2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        if (client1 == client3) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        account1.printOperations();
    }

}
