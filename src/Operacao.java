/**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */

import java.util.Date;

public class Operacao {

    public Date data;
    public char tipo;
    public double valor;
    static int totalOperacoes = 0;

    //-----------------------------------------------------------------------------------------------------//
    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
        totalOperacoes++;
    }

    //-----------------------------------------------------------------------------------------------------//
    //Getters

    public Date getDataOperacao() {
        return this.data;
    }

    public char getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }
    //-----------------------------------------------------------------------------------------------------//
    // Setters

    public void setTipo(char tipo){
        if ((tipo == 'd')||(tipo == 's')) {
            this.tipo = tipo;
        }
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    //-----------------------------------------------------------------------------------------------------//
}