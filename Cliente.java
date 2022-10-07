public class Cliente {
  String nome ;
  String cpf;
  String endereco ;
  String sexo ;
  int idade;

  void imprimir(){
      System.out.println("\n#-------CLIENTE-------#");
      System.out.println("\n->nome:"+ this.nome);
      System.out.println("->CPF:"+ this.cpf);
      System.out.println("->Endereco:"+ this.endereco);
      System.out.println("->sexo:"+ this.sexo);
      System.out.println("->idade:"+ this.idade);
    }
}