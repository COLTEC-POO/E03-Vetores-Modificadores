public class Conta {
    //atributos
    private static int totalContas =0;
    private int numConta; //Utilizar public para que possa ser acessado
    private Cliente Cliente;
    private double saldo;
    private double limite;
    private Operacao[] operações = new Operacao[1000];

    //Getters
    public int getnumConta(){
        return numConta;
    }
    public Cliente getcCliente(){
        return Cliente;
    }
    public Double getsaldo(){
        return saldo;
    }
    public Double getlimite(){
        return limite;
    }
    public int gettotalContas(){
        return totalContas;
    }
    
    

    //Setters
    public int setnumConta(){
        return numConta;
    }
    public Cliente setcCliente(){
        return Cliente;
    }
    public Double setsaldo(){
        return saldo;
    }
    public Double setlimite(){
        return limite;
    }
    public int settotalContas(){
        return totalContas;
    }

    //Ações

    public Conta(){
        this.numConta = -1;
        this.Cliente = new Cliente();
        this.saldo= 0;
        this.limite = 0;
        totalContas++;
        
    }
    //Metodo para fazer depositos
    //Para criar um metodo basta colocar o public + retorno +nome + (tipo parametro)
    public boolean depositar(double valor, char tipo){
        if (valor>=0) {
            this.saldo = this.saldo + valor;
            operações[operações[0].getNumOp()+1]=new Operacao(tipo, valor);
            return true;
        } else {
            return false;
        }
        
    }

    //Metodo para saque 

    public boolean sacar(double valor, char tipo){ //Para ter retorno se funcionou

        if(valor<=this.saldo){
            this.saldo-= valor;
            operações[operações[0].getNumOp()+1]=new Operacao(tipo, valor);
            return true; 
        }
        else{
            return false;
        }
    }

    public void imprimirDados(){
        System.out.println("Nome:" + Cliente.Nome);
        System.out.println("Nome:" + Cliente.CPF);
        System.out.println("Nome:" + Cliente.Endereco);
        System.out.println("Nome:" + Cliente.Idade);
        System.out.println("Nome:" + Cliente.Sexo);
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Saldo Atual da conta: " + saldo);
        System.out.println("Limite da conta: " + limite);
    }

    public void imprimeExtrato(){
        System.out.println("Extrato da Conta: " + this.numConta);
        if (operações[0] != null){
            for (Operacao o : operações){
                if (o!= null){
                    o.Extrato();
                }
            }
        }
        else{
            System.out.println("Não há operações realizadas na conta " + numConta);
        }
    }


}