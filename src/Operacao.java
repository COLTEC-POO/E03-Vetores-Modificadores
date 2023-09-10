/**
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
    private Date data;
    /* Tipo da operação */
    private char tipo;

    /* Valor da operação */
    private double valor;

    /* Valor total das operacoes */
    private static int Totaloperacoes = 0;
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
        Totaloperacoes++;

    }


    public Date getData(){
        return this.data;
    }

    public char getTipo(){
        return this.tipo;
    }

    public void setTipo(char tipo) {
        if(tipo == 'd' || tipo == 's'){
            this.tipo = tipo;
        }
        else{
            System.out.println("Erro ao fazer a operacao");
        }
    }

    // VALOR
    public double getValor(){
        return this.valor;
    }

    public double setValor(){
        return this.valor;
    }

    // TOTAL DE OPERAÇÕES

    public static int getTotalOperacoes() {
        return Totaloperacoes;
    }

}

