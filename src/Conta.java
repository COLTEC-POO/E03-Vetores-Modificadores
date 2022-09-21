public class Conta {

    private Cliente dono;
    private int numConta;
    private double saldo;
    private double limite;
    private Operacao[] operacoes = new Operacao[1000];
    private int contaOperacao = 0;
    public static int totalContas;

    public Conta() {
        this.dono = new Cliente();
        this.numConta = 0;
        this.saldo = 0;
        this.limite = 0;

        Conta.totalContas++;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0){
            this.limite = 0;
        }
        else{
            this.limite = limite;
        }
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        this.operacoes[contaOperacao] = new Operacao('d', valor);
        this.contaOperacao++;
    }

    public boolean sacar(double valor){

        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
            this.operacoes[contaOperacao] = new Operacao('s', valor);
            this.contaOperacao++;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean transferir (Conta destino, double valor){
        boolean saqueRealizado = this.sacar(valor);

        if (saqueRealizado){
            destino.depositar(valor);
            return true;

        }else {
            return false;
        }
    }

    public void imprimirExtrato(){
        for(int i = 0; i < this.contaOperacao; i++){
                Operacao op = this.operacoes[i];
                System.out.println(op.getData() + "\t" + op.getTipo() + "\t" + op.getValor());
        }
    }
}