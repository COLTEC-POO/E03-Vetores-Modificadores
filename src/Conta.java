import java.sql.ClientInfoStatus;

public class Conta {

    private Cliente dono;
    private int numero;
    private double saldo;
    private double limite;

    private Operacao[] operacoes;
    private int contaOperacao;

    public static int totalContas = 0;

    public Conta() {
        this.dono = new Cliente();
        this.numero = 0;
        this.saldo = 0;
        this.saldo = 0;

        this.operacoes = new Operacao[1000];
        this.contaOperacao = 0;

        Conta.totalContas++;
    }

    public void depositar(double valor){
        this.saldo += valor;

        this.operacoes[contaOperacao] = new Operacao('d', valor);
        contaOperacao++;
    }

    public boolean sacar (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;

            this.operacoes[contaOperacao] = new Operacao('s', valor);
            this.contaOperacao++;

            return true;
        }else{
            return false;
        }
    }

    public boolean tranferir (Conta destino, double valor){
        boolean saqueRealizado = this.sacar(valor);

        if (saqueRealizado){
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public void imprimir(){
        System.out.println("-----------------");

        dono.imprimir();

        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    public void imprimirExtrato (){

        System.out.println(" ----- Extrato da Conta -----");
        for (int i = 0; i < this.contaOperacao; i++){
            Operacao ope = this.operacoes[i];
            System.out.println(ope.data + "\t" + ope.tipo + "\t" + ope.valor);

        }
    }

    public void setDono(Cliente dono){
        this.dono = dono;
    }

    public Cliente getDono(){
        return this.dono;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setLimite(double limite){
        if (limite < 0){
            this.limite = 0;
        }else{
            this.limite = limite;
        }
    }

    public double getLimite(){
        return this.limite;
    }

}