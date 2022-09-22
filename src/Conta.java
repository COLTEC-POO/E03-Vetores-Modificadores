public class Conta {
    // atributos
    private Cliente titular = new Cliente();;
    private int numConta;
    private double saldo;
    private double limite;
    private Operacao[] operacoes = new Operacao[Operacao.numMaxOperacoes];
    private int qtdOperacoes;
    private static int contadorNumContas = 0;
    // ações

    public Conta(String nome, int numConta, String cpf, double limite, int idade, char sexo, String endereco){
        this.titular.setNome(nome);
        this.numConta = numConta;
        this.saldo = 0;
        this.titular.setCpf(cpf);
        this.titular.setIdade(idade);
        this.titular.setSexo(sexo);
        this.titular.setEndereco(endereco);
        if(limite < 0){
            this.limite = 0;
        }
        else{
            this.limite = limite;
        }
        Conta.contadorNumContas++;
    }

    public void imprimir(){
        System.out.println("==== Dados da conta ====");
        System.out.println("Nome...........: " + this.titular.getNome());
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo..........: " + this.saldo);
        System.out.println("Limite.........: " + this.limite);
    }

    public void imprimirSaldo(){
        System.out.println("==== Conta " +this.numConta + " ====");
        System.out.println("Nome:  "+ this.titular.getNome());
        System.out.println("Saldo: "+ this.saldo+"\n");
    }

    public boolean sacar(double valor){
        if(valor > this.saldo || valor < 0){
            return false;
        } else{
            this.saldo -=valor;
            if(this.qtdOperacoes < Operacao.numMaxOperacoes){
                this.operacoes[this.qtdOperacoes] = new Operacao('s', valor);
                this.qtdOperacoes++;
            }
            return true;
        }
    }

    public boolean depositar(double valor){
        if(valor < 0){
            return  false;
        } else{
            this.saldo += valor;
            if(this.qtdOperacoes < Operacao.numMaxOperacoes){
                this.operacoes[this.qtdOperacoes] = new Operacao('d', valor);
                this.qtdOperacoes++;
            }
            return true;
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

    public void extrato(){
        System.out.println("Extrato da conta " + this.numConta);
        for (int i = 0; i < this.qtdOperacoes; i++ ){
            System.out.println(this.operacoes[i].getData()+"\t"+this.operacoes[i].getTipo()+"\t"+this.operacoes[i].getValor() );
        }
        System.out.println();
    }

    public void mediaOperacoes(){
        double media;
        media = Operacao.totalOperacoes/Conta.contadorNumContas;
        System.out.println("A média de operações realizadas é "+media);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite < 0){
            this.limite = 0;
        }
        else{
            this.limite = limite;
        }
    }
}