public class Conta {

    //atributos da classe Conta

    private String dono;
    private int numero;
    private double saldo;
    private double limite;
    public Operacao[] operacoes= new Operacao[1000];

    public int numeroOp=0;

    //metodos da classe conta:
    //construtor:

    public Conta(){

        this.dono="<INVALIDO>";
        this.numero=-1;
        this.saldo=0;
        this.limite=0;
    }


    //metodos getters e setters:
    public String getDono(){
        return this.dono;
    }

    public void setDono(String nome){
        this.dono=nome;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite<0){
            this.limite = 0;
        } else{
            this.limite = limite;
            System.out.println("Limite alterado de "+this.limite+"para "+limite);
        }
    }

    //metodo - imprimir: imprime dados da conta
    public void imprimir (Conta conta){
        System.out.println("***Detalhamento Conta:***");
        System.out.println("Número:"+getNumero());
        System.out.println("Nome:"+getDono());
        System.out.println("Saldo:"+getSaldo());
        System.out.println("Limite:"+getLimite());
    }

    //metodo - depositar: possibilita o deposito de dinheiro na conta
    public void depositar(double valor){
        this.saldo=this.saldo+valor;
        operacoes[numeroOp]=new Operacao('d',valor);
        numeroOp++;
    }

    //metodo - saque: possibilita a retirada de dinheiro da conta
    public boolean sacar(double valor){
        if(valor<=this.saldo){
            this.saldo-=valor;
            operacoes[numeroOp]=new Operacao('s',valor);
            numeroOp++;
            return true;
        } else{
            return false;
        }
    }


    //metodo - transferir: possibilita a transferencia de dinheiro da conta
    boolean transferir(Conta destino, double valor){
        boolean saqueRealizado=this.sacar(valor);
        if (saqueRealizado){
            destino.depositar(valor);
            operacoes[numeroOp]=new Operacao('s',valor);
            numeroOp++;
            return true;
        }
        else{
            return false;
        }

    }

    //metodo - extrato
    public void extrato(Conta conta){
        System.out.println("Extrato: "+getDono());
        for(int i=0;i< operacoes.length;i++){
            if(operacoes[i].getTipo() !='n') {
                System.out.println(operacoes[i].getData()+" "+operacoes[i].getTipo()+" "+operacoes[i].getValor());
            }
        }
    }


}