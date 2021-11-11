
/**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */

import java.util.Date;

/**
 * Classe responsável por registrar operações de saque e depósitos realizados em
 * contas correntes.
 */
public class Operacao {

    /* Data de realização da operação */
    public Date data;

    /* Tipo da operação */
    public char tipo;

    /* Valor da operação */
    public double valor;

    // Static count of operations
    private static int count = 0;

    /**
     * Construtor. Inicializa uma nova instância da classe Operacao onde a data da
     * operação é exatamente a data da criação da classe.
     *
     * Exemplos de uso:
     *
     * > Operacao op1 = new Operacao('d', 2500); // Operação de depósito de 2500
     * reais > Operacao op2 = new Operacao('s', 1000); // Operação de saque de 1000
     * reais
     *
     * @param tipo  Tipo da operação, podendo ser 'd' ou 's'
     * @param valor Valor da operação
     */
    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();

        Operacao.count++;
    }

    public Operacao(char tipo, double valor, Date date) {
        this.tipo = tipo;
        this.valor = valor;
        data = date;

        Operacao.count++;
    }

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTotalOperacoes() {
        return Operacao.count;
    }

}