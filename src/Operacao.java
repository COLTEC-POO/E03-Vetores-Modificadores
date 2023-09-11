import java.util.Date;

public class Operacao {
    private Date data;          // Data de realização da operação
    private char tipo;         // Tipo da operação: 'd' para depósito e 's' para saque
    private double valor;     // Valor da operação
    private static int totalOperacoes = 0;

    public Operacao(char tipo, double valor) {

        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
        totalOperacoes++;
    }

    // Getters da Classe Operacao
    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static int getTotalOperacoes() {
        return totalOperacoes;
    }
    // FIM Getters

    // Setters
    private void setData(Date data) {
        this.data = data;
    }

    public void setTipo(char tipo) {
        if (tipo == 'd' || tipo == 's') {
            this.tipo = tipo;
        }
        else{
            System.out.println("Erro!");
        }
    }

    public double setValor() {
        return  this.valor;
    }

    // FIM Setters

    public void exibirOperacao() {
        System.out.println(this.data + "  \t " + this.tipo + "  \t " + this.valor);
    }
}
