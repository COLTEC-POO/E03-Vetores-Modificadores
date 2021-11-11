import java.util.Date;

public class Operacao {

    public Date data;
    public char tipo;
    public double valor;

    public static int totalOperacoes = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();

        Operacao.totalOperacoes++;
    }

    public Date getData(){
        return this.data;
    }

    public char getTipo(){
        return this.tipo;
    }

    public void setTipo (char tipo){
        if (tipo == 's' || tipo == 'd');
        this.tipo = tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

}