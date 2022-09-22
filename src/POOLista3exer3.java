public class conta{
   private int numero;
   private String titular;
   private double saldo;
   private double limite;
   private String operacao;
   
   public int getnumero() {
        return this.numero;
        
}
   public void setnumero(int numero) {
        this.numero = numero;
    }

  public string gettitular() {
        return this.titular;
        
}
   public void settitular(String titular) {
        this.titular = titular;
    }
    
    public double getsaldo() {
        return this.saldo;
        
}
   public void setsaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getlimite() {
        return this.limite;
        
}
   public void settitular(double limite) {
        this.lomite = limite;
    }
    
    
    public int getoperacao() {
        return this.operacao;
        
}
   public void settitular(String operacao) {
        this.operacao = operacao;
    }  
  
  
  
}



//classe main
public class main {
  public static void main(string[]args){
    conta minhaconta= new conta();
      
    minhaconta.titular='Maria';
    minhaconta.numero='0001-1';
    minhaconta.saldo='10.000,00';
    minhaconta.limite='5.0000,00';
	minhaconta.operacao='1000';
    
    System.out.println(minhaconta.titular);
    System.out.println(minhaconta.numero);
    System.out.println(minhaconta.saldo);
    System.out.println(minhaconta.limite);
    System.out.println(minhaconta.operacao);


   }
}

public void imprimir{

  minhaconta.nomeconta='José';
  minhaconta.numeroconta='02020-91';
  minhaconta.saldoatual='10.000';
  minhaconta.limitecartaocredito='30.000';
  

  System.out.println(minhaconta.nomeconta);
  Systen.out.println(minhaconta.numeroconta);
  System.out.println(minhaconta.saldoatual);
  Systen.out.println(minhaconta.limitecartaocredito);
  
  //classe cliente;

public class cliente{
   private String nome;
   private String CPF;
   private String Endereco;
   private int idade;
   private char sexo;
}


public String getnome() {
        return this.nome;
        
}
   public void setnome(String nome) {
        this.nome = nome;
    }  
    
    public String getCPF() {
        return this.CPF;
        
}
   public void setCPF(String CPF) {
        this.CPF = CPF;
    }  
  public String getEndereco() {
        return this.Endereco;
        
}
   public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }  
  
  public int getidade() {
        return this.idade;
        
}
   public void setidade(int idade) {
        this.idade = idade;
    }  
    
    public char getsexo() {
        return this.sexo;
        
}
   public void setsexo(char sexo) {
        this.sexo = sexo;
    }  
  
  
  
  
  
  
  
  

//clase main com impressões

public static void main(String[]args){

  cliente meucliente = new cliente();
  
  meucliente.nome='Jose';
  meucliente.CPF='01010101011';
  meucliente.endereco='rua A, numero C, bairro D, Cidade E';
  meucliente.idade='25';
  meucliente.sexo='F';

System.out.println(meucliente.nome);
System.out.println(meucliente.CPF);
System.out.println(meucliente.endereco);
Sytem.out.println(meucliente.idade);
System.out.println(meucliente.sexo);

}
}	
  
//lista 3 exercicio 2
public static void main(String[]args){

public class Conta{
    private String NomeTitular;
    private int NumeroConta;
    private float SaldoConta;
  
  
  
  public String getNomeTitular() {
        return this.NomeTitular;
        
}
   public void setNomeTitular(String NomeTitular) {
        this.NomeTitular = Nome.Titular;
    }  
    
    public int getNumeroConta() {
        return this.numeroConta;
        
}
   public void setNumeroConta(int NumeroConta) {
        this.NumeroConta = NumeroConta;
    }  
  
  public float getSaldoConta() {
        return this.SaldoConta;
        
}
   public void setSaldoConta(float SaldoConta) {
        this.SaldoConta = SaldoConta;
    }  
  
  
  
  
  
  public static void main(String[]args){
  
  Conta extrato = new Conta();
  extrato.NomeTitular(Maria Aparecida);
  extrato.NumeroConta(000598-47);
  extrato.SaldoConta(50000.00);
  
  
    //  colocar os gets e sets

    public void ImprimirExtrato(){
            System.out.println("Nome do titular: " + NomeTitular);
            System.out.println("Numero da Conta: " + NumeroConta);
            System.out.println("Saldo atual da conta: " + SaldoConta);
       }

}




//*******************************************************

//lista 3 exer3

**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */

import java.util.Date;

/**
 * Classe responsável por registrar operações de saque e depósitos realizados em contas correntes.
 */
public class Operacao {

    /* Data de realização da operação */
    public Date data;

    /* Tipo da operação */
    public char tipo;

    /* Valor da operação */
    public double valor;

    /**
     * Construtor. Inicializa uma nova instância da classe Operacao onde a data da operação é exatamente a data
     * da criação da classe.
     *
     * Exemplos de uso:
     *
     * > Operacao op1 = new Operacao('d', 2500); // Operação de depósito de 2500 reais
     * > Operacao op2 = new Operacao('s', 1000); // Operação de saque de 1000 reais
     *
     * @param tipo Tipo da operação, podendo ser 'd' ou 's'
     * @param valor Valor da operação
     */
    public Operacao(char tipo, double valor) {
        private  this.tipo = tipo;
        private this.valor = valor;
        private data = new Date();
		
    }

}
