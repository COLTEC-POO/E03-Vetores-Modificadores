import java.util.Date;

public class Operacao {
    private Date data;
    private char tipo;
    private double valor;
    public static double totalOperacoes = 0; // Tive que declarar como double pra não dar problema na hora de calcular a média


    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
        Operacao.totalOperacoes++;
    }

    // Getters e Setters

    public Date getData() {
        return this.data;
    }

    public char getTipo() {
        return this.tipo;
    }

    public void setTipo(char tipo){
        if (tipo != 's' || tipo != 'd'){
            System.out.println("Tipo inválido!");
        } else {
            this.tipo = tipo;
        }
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    
}