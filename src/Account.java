import java.text.NumberFormat;

public class Account {
    private int id;
    private double total;
    private double limit;
    private Client owner;
    private Operacao[] operations = new Operacao[10000];
    private int currentOperation = 0;
    private static int count = 0;

    public Account(Client owner, double total, double limit, int id) {
        this.total = total;
        this.limit = limit;
        this.id = id;
        this.owner = owner;
        Account.count++;
    }

    public boolean withdraw(double amount) {
        if (amount > total || amount <= 0) {
            return false;
        }

        this.operations[currentOperation] = new Operacao('D', amount);
        ++this.currentOperation;

        total -= amount;
        return true;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        this.operations[this.currentOperation] = new Operacao('C', amount);
        ++this.currentOperation;

        this.total += amount;
        return true;
    }

    public void printInfo() {
        this.printOwner();
        this.printBalance();
        this.printLimit();
    }

    public void printLimit() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(this.limit);
        System.out.println("Limit: " + moneyString);
    }

    public void printBalance() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(this.total);
        System.out.println("Balance: " + moneyString);
    }

    public void printOwner() {
        System.out.println("Owner: " + this.owner.getName());
    }

    public void printOperations() {
        System.out.println("Operations:");

        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == null) {
                break;
            }

            System.out.println(
                    operations[i].getData() + "\t" + operations[i].getTipo() + "\t" + operations[i].getValor());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public double getTotal() {
        return total;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public int getTotalAccounts() {
        return Account.count;
    }

}
