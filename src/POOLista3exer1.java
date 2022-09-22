public class conta{
  int numero;
  String titular;
  double saldo;
  double limite;
  String operacao;
  
  
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
  String nome;
  String CPF;
  String Endereco;
  int idade;
  char sexo;
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
  
Footer






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
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
		
    }

}