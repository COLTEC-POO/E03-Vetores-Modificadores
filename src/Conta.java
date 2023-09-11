import java.util.Date;

public class Conta {

    //atribuições
    private int numero;
    Cliente dono = new Cliente();
    private double saldo;
    private double limite;
    //private String senha;
    Operacao[] operacoes = new Operacao[1000];
    int operacaoAtual=0;
    static int totalContas=0;

    //acoes
    public Conta(){
        this.numero=-1;
        this.dono.nome= "<INVALIDO>";
        this.dono.cpf="<INVALIDO>";
        this.dono.endereco="<INVALIDO>";
        this.dono.sexo='-';
        this.dono.idade=0;
        this.saldo = 0;
        this.limite =0;
        totalContas=totalContas+1;
    }

    public void depositar(double valor){

        this.saldo = this.saldo + valor;
        operacoes[this.operacaoAtual] = new Operacao('d', valor);
        this.operacaoAtual=this.operacaoAtual+1;
    }
    public boolean sacar(double valor){
        if(valor<= this.saldo){
            this.saldo -= valor;
            operacoes[this.operacaoAtual] = new Operacao('s', valor);
            this.operacaoAtual=this.operacaoAtual+1;
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor){
        boolean retirou = this.sacar(valor);
        if(retirou){
            contaDestino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public Cliente getDono(){
        return this.dono;
    }
    public void setDono(Cliente dono){
        this.dono = dono;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }

    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double limite){
        if (limite>0) {
            this.limite = limite;
        }else {
            this.limite=0;
        }
    }


    public void imprimir(){
        System.out.println("INFORMACOES DA CONTA:");
        System.out.println("Numero: "+this.numero);
        System.out.println("Nome: "+this.dono.nome);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("INFORMACOES DO CLIENTE: ");
        System.out.println("CPF: "+this.dono.cpf);
        System.out.println("Endereco: "+this.dono.endereco);
        System.out.println("Sexo: "+this.dono.sexo);
        System.out.println("Idade: "+this.dono.idade);
    }

    public void imprimirExtrado(){
        for (int i=0; i<this.operacaoAtual; i++){
            System.out.println(this.operacoes[i].getdata()+" "+this.operacoes[i].getTipo()+" "+this.operacoes[i].getValor());
        }
    }
}


