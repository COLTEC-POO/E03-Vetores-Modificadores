public class Client {
    private String name;
    private String cpf;
    private String address;
    private int age;
    private char sex;

    public Client(String name, String cpf, String address, int age, char sex) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return this.sex;
    }
}
