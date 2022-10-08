public class Main {
    public static void main(String[] args){
        //Criação de variavel para referenciar a classe Conta
        Conta minhaConta = new Conta();
        Conta contaGabi = new Conta();
       
        minhaConta.depositar(1500,'d');
        minhaConta.sacar(650, 's');
        minhaConta.imprimeExtrato();

        contaGabi.depositar(2000, 'd');
        contaGabi.sacar(580, 's');
        contaGabi.imprimeExtrato();

        System.out.println("A media de operações é: " + ((minhaConta.NumOp()+contaGabi.NumOp()))/minhaConta.gettotalContas());
        

        



    

    }
    
}
