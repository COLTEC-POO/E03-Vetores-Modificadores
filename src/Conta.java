public class Conta {

    //atributos da classe Conta

    Cliente dono;
    int numero;
    double saldo;
    double limite;
    public Operacao[] operacoes= new Operacao[1000];
    public int numeroOp=0;

    //metodos da classe conta:

    //metodo - imprimir: imprime dados da conta
    public void imprimir (Conta conta){
        System.out.println("***Detalhamento Conta:***");
        System.out.println("Número:"+this.numero);
        System.out.println("Nome:"+this.dono.nome);
        System.out.println("Idade:"+this.dono.idade);
        System.out.println("Endereço:"+this.dono.endereco);
        System.out.println("CPF:"+this.dono.cpf);
        System.out.println("Sexo:"+this.dono.sexo);
        System.out.println("Saldo:"+this.saldo);
        System.out.println("Limite:"+this.limite);
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
            return true;
        }
        else{
            return false;
        }

    }

}