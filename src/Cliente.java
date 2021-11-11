public class Cliente {

    public String nome;
    public String cpf;
    public String endereco;
    public int idade;
    public char sexo;

    public void imprimir(){

        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);

    }

}