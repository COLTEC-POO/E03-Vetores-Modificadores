import java.util.Scanner;

public class Conta {

    // Variaveis privadas
    private int numero;
    private String senha;
    private double saldo;
    private String dono;
    private double limite;

    // Inicializando o array de operacoes
    private Operacao[] operacoes;

    // Numeros de Operacoes;
    private int numOp;

    //Numero de Contas;
    private static int numdeContas = 0;

    // Construtor da Conta
    public Conta(int numero, String senha, double saldo, String dono) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;
        setLimite(limite);

        this.operacoes = new Operacao[1000];

        this.numOp = 0;
        numdeContas++;
    }

    // Metodo para verificar o valor depositado e salvar a operacao
    public boolean depositar(double valor) {
        saldo += valor;

        if (valor >= 0) {
            this.saldo += valor;

            operacoes[numOp] = new Operacao('d', valor);
            numOp++;
            return true;
        } else {
            return false;
        }
    }

    // Metodo para verificar o valor a ser sacado e salvar a operacao
    public boolean sacar(double valor) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.operacoes[this.numOp] = new Operacao('s', valor);
            numOp++;
            return true;
        } else {
            return false;
        }
    }

    public static Conta[] regContas() {
        Scanner linhaDeComando = new Scanner(System.in);

        // TIPO[] nomeArray = new TIPO[TAMANHO];
        int tamanho;

        System.out.println("Informe a quantidade de contas: ");
        tamanho = linhaDeComando.nextInt();
        linhaDeComando.nextLine();
        Conta[] contas = new Conta[tamanho];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Digite o nome do dono:");
            String dono = linhaDeComando.nextLine();

            System.out.println("Digite o numero da conta:");
            int numero = linhaDeComando.nextInt();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite a senha da conta:");
            String senha = linhaDeComando.nextLine();

            System.out.println("Digite o saldo da conta:");
            double saldo = linhaDeComando.nextDouble();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            contas[i] = new Conta(numero, senha, saldo, dono);
        }

        for (Conta contaAtual : contas) {
            System.out.println("Dono da conta: " + contaAtual.getDono());
        }
        return contas;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta " + this.getDono());
        for (int i = 0; i < numOp; i++) {
            Operacao operacao = operacoes[i];
            System.out.println(" " + operacao.getDataOp() + "  " + (operacao.getTipo() == 'd' ? "d" : "s") + "  " + operacao.getValor());
        }
    }

    public static int getNumdeContas() {
        return numdeContas;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite >= 0) {
            this.limite = limite;
        } else {
            this.limite = 0;
        }
    }
}