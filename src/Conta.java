public class Conta {

    //Conteudo class conta

    Cliente memoryCliente;
    private int memoryId;
    private double memorySaldo;
    private double memoryLimite;
    private int posicaoOpr = 0;
    static int totalContas = 0;
    Operacao [] operacoes = new Operacao [1000];

    //-----------------------------------------------------------------------------------------------------//
    public Conta (){
        totalContas++;
    }
    //-----------------------------------------------------------------------------------------------------//
    //Getters

    public int getMemoryId(){
        return this.memoryId;
    }

    public Cliente getMemoryCliente(){
        return this.memoryCliente;
    }

    public double getSaldo(){
        return this.memorySaldo;
    }

    public double getLimite(){
        return this.memoryLimite;
    }
    //-----------------------------------------------------------------------------------------------------//
    //Setters

    public void setMemoryCliente(Cliente memoryCliente){
        this.memoryCliente = memoryCliente;
    }

    public void setMemoryId(int memoryId){
        this.memoryId = memoryId;
    }

    public void setMemoryLimite(int memoryLimite) {
        if (memoryLimite < 0) {
            this.memoryLimite = 0;
        } else {
            this.memoryLimite = memoryLimite;
        }
    }
    //-----------------------------------------------------------------------------------------------------//
    public void depositar(double memoryValor){
        Operacao opr;
        this.memorySaldo=this.memorySaldo+memoryValor;
        opr = new Operacao ('d', memoryValor);
        operacoes[posicaoOpr] = opr;
        posicaoOpr ++;
    }
    //-----------------------------------------------------------------------------------------------------//
    public boolean sacar(double memoryValor){
        Operacao opr;
        if(memoryValor<=this.memorySaldo){
            this.memorySaldo-=memoryValor;
            opr = new Operacao ('s', memoryValor);
            operacoes[posicaoOpr] = opr;
            posicaoOpr ++;
            return true;
        } else{
            return false;
        }
    }
    //-----------------------------------------------------------------------------------------------------//
    boolean transferir(Conta destino, double memoryValor){
        boolean saqueRealizado=this.sacar(memoryValor);
        if (saqueRealizado){
            destino.depositar(memoryValor);
            return true;
        }
        else{
            return false;
        }

    }
    //-----------------------------------------------------------------------------------------------------//
void imprimirExtrato (){
    int i;
    for (i = 0; i < posicaoOpr; i++){
        Operacao operacaoAtual;
        operacaoAtual = operacoes[i];
        System.out.println(operacaoAtual.getDataOperacao() + "\t" + operacaoAtual.getTipo() + "\t" + operacaoAtual.getValor());
    }
}
   //-----------------------------------------------------------------------------------------------------//
}

