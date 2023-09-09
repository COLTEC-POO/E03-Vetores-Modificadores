public class Conta {

    private int numero;
    String senha;
    private double saldo;
    private Cliente dono;
    private double limite;
    Operacao[] operacoes;
    int ProxOperacao;
    private static int totalContas = 0;



    public Conta(int numero, String senha, double saldo,Cliente dono,double limite){

        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;
        this.limite = limite;

        operacoes = new Operacao[1000];
        ProxOperacao = 0;

        // Conta quantas novas contas já foram criadas
        totalContas++;

    }


    //public TIPO_RETORNO NOME_DO_MÉTODO(TIPO VARI1, TIPO VARI2,...){
    //}

    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;

            Operacao operacao = new Operacao('d', valor);
            RegistrarOperacoes(operacao);

            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;

            Operacao operacao = new Operacao('s', valor);
            RegistrarOperacoes(operacao);
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

    public void RegistrarOperacoes(Operacao operacao){

        if (ProxOperacao < 1000) {
            operacoes[ProxOperacao] = operacao;
            ProxOperacao++;
        }

    }

    public void imprimirExtrato(){

        for(int i = 0; i < ProxOperacao; i++){

            Operacao operacao = operacoes[i];
            System.out.println(operacao.getData() + "\t" + operacao.getTipo() + "\t" + operacao.getValor());
        }
    }

    public void imprimir(){

        System.out.println("Nome: "+ dono.nome);
        System.out.println("Numero da conta: "+ numero);
        System.out.println("CPF: "+ dono.cpf);
        System.out.println("Endereco: "+ dono.endereco);
        System.out.println("Idade: "+ dono.idade);
        System.out.println("Sexo: "+ dono.sexo);

        System.out.println("Saldo atual: "+ saldo);
        System.out.println("Limite: "+ limite);

    }

    // GETTERS e SETTERS

    // DONO
    public Cliente getDono(){
        return this.dono;
    }
    public Cliente setDono(){
        return this.dono;
    }

    // NUMERO
    public int getNumero(){
        return this.numero;
    }
    public int setNumero(){
        return this.numero;
    }

    // SALDO
    public double getSaldo(){
        return this.saldo;
    }

    //LIMITE
    public double getLimite(double limite){

        return this.limite;
    }

    public double setLimite(double limite){
        if(numero >= 0){
            this.limite = limite;
        }
        return this.limite = 0;
    }

    // TOTAL DE CONTAS

    public static int getTotalContas(){
        return totalContas;
    }

}
