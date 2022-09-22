import java.util.Scanner;

public class Cliente{

    //----------------------------------------- Atribultos Classe ------------------------------------------------//
    private String nome;
    private  Integer idade;
    private String CPF;
    private  String endereco;
    private char sexo;

    //---------------------------------------- Fim Atribultos Classe ---------------------------------------------//


    //------------------------------------------ Metodo Construtor -----------------------------------------------//
    public Cliente(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu Nome: ");
        this.setNome(entrada.nextLine());

        receberIdadeValidada();

        System.out.println("Informe seu CPF: ");
        this.setCPF(entrada.nextLine());

        System.out.println("Informe seu Endereço: ");
        this.setEndereco(entrada.nextLine());

        receberSexoValidado();

    }

    //---------------------------------------- Fim Metodo Construtor ---------------------------------------------//


    //--------------------------------------------- Metodos Get --------------------------------------------------//

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public char getSexo() {
        return sexo;
    }

    //-------------------------------------------- Fim Metodos Get -----------------------------------------------//


    //----------------------------------- Metodos Set || Alterações de Valores: ----------------------------------//

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setIdade(Integer idade) {
        this.idade = idade;
    }

    private void setCPF(String CPF) {
        this.CPF = CPF;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //-------------------------------- Fim Metodos Set || Alterações de Valores: ---------------------------------//


    //------------------------------------ Metodos Receber Dados Validos -----------------------------------------//

    public void receberIdadeValidada(){
        Scanner entrada = new Scanner(System.in);
        boolean ERRO;

        do {
            System.out.println("Informe sua Idade: ");
            this.setIdade(entrada.nextInt());
            ERRO = (this.getIdade() < 0 || this.getIdade() > 130);
            if(ERRO) System.out.println("IDADE INVALIDA");
            entrada.nextLine();
        }while (ERRO);
    }

    public void receberSexoValidado(){
        Scanner entrada = new Scanner(System.in);
        boolean ERRO;

        do{
            System.out.println("Informe o sexo [M/F]: ");
            this.setSexo(entrada.next().charAt(0));
            ERRO = this.getSexo() != 'F' && this.getSexo() != 'M' && this.getSexo() != 'm' && this.getSexo() != 'f';
            if(ERRO) System.out.println("INFORME UM VALOR VALIDO [F/M]!");
            entrada.nextLine();
        }while(ERRO);
    }

    //---------------------------------- Fim Metodos Receber Dados Validos ---------------------------------------//

}
