import java.util.Date;

public class Conta {
    // Atributos
    private Cliente cliente;
    private String Dono;
    private int numeroConta;
    private double saldoConta;
    private double limiteConta;
    Operacao[] operacoes = new Operacao[1000];
    public static int totalContas = 0;

    // Construtor - possui o mesmo nome da Classe
    // Define valores padrões para inicialização
    // Método especial invocado toda vez que um novo objeto é criado
    public Conta() {
        this.cliente = new Cliente();
        this.numeroConta = -1;
        this.limiteConta = 0;
        this.saldoConta = 0;
        totalContas++;
    }

    // Getters da Classe Conta

    public String getDono(){
        return Dono;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public Cliente cliente() {
        return cliente;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    // Setters da Classe Conta

    public void setDono(){
        this.Dono = Dono;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    // Método para Depositar
    public boolean depositar(double valor, char tipo) {
        if (valor >= 0) {
            this.saldoConta += valor;
            operacoes[Operacao.getTotalOperacoes()] = new Operacao(tipo, valor);
            return true;
        } else {
            return false;
        }
    }

    // Método para Sacar
    public boolean sacar(double valor, char tipo) {
        if (valor <= this.saldoConta) {
            this.saldoConta -= valor;
            operacoes[Operacao.getTotalOperacoes()] = new Operacao(tipo, valor);
            return true;
        } else {
            return false;
        }
    }

    public void imprimirExtrato() {

        if (Operacao.getTotalOperacoes() > 0) {
            for (int i=0; i< Operacao.getTotalOperacoes(); i++) {
                operacoes[i].exibirOperacao();
            }
        } else {
            System.out.println("Sem registro de operações na conta atual");
        }
    }
}