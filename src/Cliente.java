public class Cliente {

    //atributos
    private static Integer qtdClientes = 0;

    // Nome (String)
    // CPF (String)
    // Endereço (String)
    // Idade (int)
    // Sexo (char, para armazenar 'm' ou 'f')

    private String nome;
    private String cpf;
    private String endereco;
    private Integer idade;
    private String sexo;

    /**
     * @param nome
     * @param cpf
     * @param endereco
     * @param idade
     * @param sexo
     */
    public Cliente(String nome, String cpf, String endereco, Integer idade, String sexo){
        try{
            validaNome(nome);
            validaCPF(cpf);
            validaEndereco(endereco);
            validaIdade(idade);
            validaSexo(sexo);
            qtdClientes++;
        }catch (Exception e) {
            System.out.println("Dados invalidos!");
        }
    }

    //Getters
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public String getSexo(){
        return this.sexo;
    }
    //FIM Getters

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    //FIM Setters

    //Validadores de dados
    private void validaNome(String nome){
        setNome(nome);
    }

    private void validaCPF(String cpf){
        setCPF(cpf);
    }

    private void validaEndereco(String endereco){
        setEndereco(endereco);
    }

    private Boolean validaIdade(Integer idade){
        if (idade >= 0 && idade < 100){
            setIdade(idade);
            return true;
        }
        return false;
    }

    private void validaSexo(String sexo){
        if (sexo == "M" || sexo == "F")
            setSexo(sexo);
    }
    //FIM Validadores



    //Funções

    public void mostraCliente(){
        System.out.println("Nome " + this.nome + " CPF: " + this.cpf);
        System.out.println("Endereço " + this.endereco);
        System.out.println("Idade: " + this.idade + " Sexo: " + this.sexo);
    }

    //FIM Funções
}


