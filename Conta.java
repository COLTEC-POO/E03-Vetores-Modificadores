/**
 * this é usado para acessar e referir ao valor presente no tipo
 **/

public class Conta {
  private int numero;
  private String dono;
  private double saldo;
  private double limite;

  public static int num_contas;
  public static int num_operacao;

  Operacao OP[];

  /**
   * Construtor da classe conta
   * -> Ao criar o construtor dessa classe,o mesmo já inicializa acessando algumas
   * das variaveis da classe
   **/
  public Conta(int numero, String dono) {
    this.numero = numero;
    this.dono = dono;
    OP = new Operacao[1_000];
    this.num_operacao = 0;
    num_contas++;
  }

  // geter - serve apenas para leitura de variaveis privadas
  // seter - serve para a escrita de variaveis privadas
  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getDono() {
    return this.dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getLimite() {
    return this.limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public void sacar(double valor) {
    Operacao op = new Operacao('s', valor);
    if (valor <= this.saldo) {
      this.saldo -= valor;
      double novoSaldo = this.saldo - valor;
      this.saldo = novoSaldo;
    } else {
      System.out.println("ERRO AO SACAR: SALDO INSUFICIENTE \n");
    }
    this.OP[num_operacao] = op;
    num_operacao++;
  }

  public void depositar(double valor) {
    Operacao op = new Operacao('d', valor);
    this.saldo += valor;
    this.OP[num_operacao] = op;
    num_operacao++;
  }

  public void imprimirDadosConta() {
    System.out.println("#-------CONTA-------#");
    System.out.println("\n->nome:" + this.dono);
    System.out.println("->numero:" + this.numero);
    System.out.println("->limite:" + this.limite);
    System.out.println("->saldo:" + this.saldo);
  }

  public void imprimirExtrato() {
    System.out.println("#-------EXTRATO-------#");
    for (int i = 0; i < this.num_operacao; i++) {
      System.out.println("->" + this.OP[i].data + this.OP[i].valor + this.OP[i].tipo);
    }
  }
}