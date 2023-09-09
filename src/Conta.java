public class Conta {
    private int numero;
    private String senha;
    private double saldo;
    private String nome;
    private double limite;
    Operacao[] operacoes;
    int ultimaPosicao;

    //construtores
    public Conta(int numero, String senha, double saldo, String nome, double limite){

        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.nome = nome;
        setLimite(limite);

        this.operacoes = new Operacao[1000];
        this.ultimaPosicao = 0;
    }

    public String getNome() {
        return  nome;
    }

    public void setNome(String dono) {
        this.nome = nome;
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

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            this.operacoes[this.ultimaPosicao] = new Operacao('d', valor);
            this.ultimaPosicao++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.operacoes[this.ultimaPosicao] = new Operacao('s', valor);
            this.ultimaPosicao++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        else{
            return false;
        }
    }

    public void dadosBanc(){

        System.out.println("Nome: "+ nome);
        System.out.println("Numero da conta: "+ numero);
        System.out.println("Saldo atual: "+ saldo);
        System.out.println("Limite: "+ limite);

    }

    public void extrato() {

        System.out.println("Extrato");
        for(int i = 0; i < ultimaPosicao; i++) {
            Operacao operacao = operacoes[i];
            System.out.println(operacao.getDataOp() + "  " + (operacao.getTipo() == 'd' ? "d" : "s" ) + "  " + operacao.getValor());
            System.out.println();
        }
    }
}