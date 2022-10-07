class Main {
  public static void main(String[] args) {
    Conta conta1;
    conta1 = new Conta(1,"Joao Victor");
    
    conta1.setSaldo(1_500);
    conta1.setLimite(1_500);

    conta1.imprimirDadosConta();

    conta1.sacar(500);
    conta1.depositar(250);
    
    conta1.imprimirDadosConta();
    
    conta1.imprimirExtrato();
/**-------------------**/
    Conta conta2;
    conta2 = new Conta(2,"Felipe");

    conta2.setSaldo(3_300);
    conta2.setLimite(3_500);

    conta2.imprimirDadosConta();

    conta2.sacar(225);
    conta2.sacar(250);
    conta2.depositar(50);
    conta2.depositar(100);
    
    conta2.imprimirDadosConta();
    
    conta2.imprimirExtrato();

    System.out.println("#CONTA:" + conta2.num_contas);
  }
}
