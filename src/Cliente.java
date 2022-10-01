public class Cliente {
    
    public String nome;
    public String cpf; 
    public String endereco;
    public int idade;
    public char sexo;

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {  
        return this.cpf;
    }

    public String getEndereco() {  
        return this.endereco;
    }
    
    public int getIdade() {  
        return this.idade;
    }

    public char getSexo() { 
        return sexo;
    }

    public void imprimirDadosCliente() {
        System.out.println("....CPF:  " + cpf);
        System.out.println("....Endereco:  " + endereco);
        System.out.println("....Idade:  " + idade);
        System.out.println("....Sexo:  " + sexo);
    }
}