import java.lang.management.OperatingSystemMXBean;

public class Conta {
    // Atributos

    private Cliente dono = new Cliente();
    private int numeroConta;
    private double saldo;
    private double limite;
    private static int totalDeContas;

    private Operacao[] operacoes = new Operacao[1000];

    // ----------------------------------------------
    //Getters and Setters

    public Operacao[] getOperacoes() {
        return operacoes;
    }

    public Cliente getDono() {
        return this.dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public int setNumeroConta(int numero) {
        return this.numeroConta = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public double setLimite(double limite) {
        System.out.println("Limite alterado de " + this.limite +
                " para " + limite);

        return this.limite = limite;
    }

    public int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    //Construtor
    public Conta(){
        this.dono.nome = "-------";
        this.dono.cpf = "00000000000";
        this.dono.idade = 0;
        this.dono.endereco = "---------";
        this.dono.sexo = '-';
        this.numeroConta = 0;
        this.saldo = 0;
        this.limite = 0;

        Conta.totalDeContas++;
    }

    // Metodos

    public void imprimeDadosUsuario() {
        System.out.println("===Conta bancaria " + this.numeroConta + " ===");
        System.out.println("Nome: " + this.dono.nome);
        System.out.println("CPF: " + this.dono.cpf);
        System.out.println("Endereco: " + this.dono.endereco);
        System.out.println("Idade: " + this.dono.idade);
        System.out.println("Sexo: " + this.dono.sexo);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);

    }

    public void depositar(double valor) {
        if (valor < 0.0) {
            System.out.println("Nao foi possivel depositar esse valor!");
        } else {
            this.operacoes[Operacao.contaOperacoes] = new Operacao('d', valor);
            this.saldo = this.saldo + valor;
        }
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo && (valor > 0.0)) {
            this.operacoes[Operacao.contaOperacoes] = new Operacao('s', valor);
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void extrato(){
        for(int i = 0; i < Operacao.contaOperacoes; i++) {
            System.out.println(this.operacoes[i].getData() + " "
                             + this.operacoes[i].getTipo() + " "
                             + this.operacoes[i].getValor());
        }
    }
}
