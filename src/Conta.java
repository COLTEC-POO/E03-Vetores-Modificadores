public class Conta {

    public static int contadorNumContas = 0;
    public static int contadorNumOperacoes = 0;

    // atributos
    public String nome;
    public int numConta;
    private double saldo;
    public String cpf;
    public boolean tipo;

    public Operacao[] operacoes = new Operacao[1000];

    // ações
    public Conta(String nome, int numConta, String cpf, boolean tipo){
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = 0;
        this.cpf = cpf;
        this.tipo = tipo;
        Conta.contadorNumContas++;
    }

    public void imprimirSaldo(){
        System.out.println("==== Conta " +this.numConta + " ====");
        System.out.println("Nome:  "+ this.nome);
        System.out.println("Saldo: "+ this.saldo);
    }

    public boolean sacar(double valor){
        if(valor > this.saldo || valor < 0){

            return false;
        } else{
            this.saldo -=valor;
            this.operacoes[contadorNumOperacoes] = new Operacao('s', valor);
            contadorNumOperacoes++;
            return true;
        }
    }

    public boolean depositar(double valor){
        if(valor < 0){
            return  false;
        } else{
            this.operacoes[contadorNumOperacoes] = new Operacao('d', valor);
            contadorNumOperacoes++;
            this.saldo += valor;
            return true;
        }
    }
    public void extrato(){
        for (int i =0;i< contadorNumOperacoes;i++) {
            System.out.println(this.operacoes[i].data + "    " + this.operacoes[i].tipo + "    " + this.operacoes[i].valor);
            System.out.println();
        }


    }
    public boolean transferir(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        } else{
            return false;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
}