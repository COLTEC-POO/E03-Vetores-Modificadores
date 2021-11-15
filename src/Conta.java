public class Conta {
    private int numero;
    private Cliente dono;
    private double saldo;
    private double limite;

    public Operacao [] operacoes;
    public int numOperacoes;

    public static int TOTAL_CONTAS = 0;


    //Construtor
    public Conta(){

        this.numero = 0;
        this.dono = new Cliente();
        this.saldo = 0;
        this.limite = 0;

        this.operacoes = new Operacao[1000];
        this.numOperacoes = 0;

        Conta.TOTAL_CONTAS++;

    }

    //depositos
    public void depositar (double valor){

        this.saldo = this.saldo + valor;

        this.operacoes[numOperacoes] = new Operacao('d', valor);
        numOperacoes++;
    }

    //saques
    public boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;

            this.operacoes[numOperacoes] = new Operacao ('s', valor);
            this.numOperacoes++;

            return true;
        } else {
            return false;
        }
    }

    //transferencia
    public boolean transferir(Conta contaDestino, double valor){

        boolean retirou = this.sacar(valor);
        if (retirou){
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }


    //imprimir dados da conta na tela

    public void imprimir(){

        System.out.println("====" + this.numero + "===");
        dono.imprimir();
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    public void imprimirExtrato(){
        System.out.println("==== Extrato de Operações ===");
        for (int i = 0; i <this.numOperacoes; i++){
            this.operacoes[i].imprimir();
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
        if (limite < 0)
            this.limite = 0;
        else
            this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }
}
