
import java.util.Date;
public class Operacao {

    /* Data de realização da operação */
    private Date data;

    /* Tipo da operação */
    private char tipo;

    /* Valor da operação */
    private double valor;

    private static int NumOp=0;

    public Date getdata(){
            return data;
    }
    public char gettipo(){
        return tipo;
    }
    public double getvalor(){
        return valor;
    }
    public int getNumOp(){
        return NumOp;
    }
    
    public void setdata(){
        this.data = new Date();
    }
    public void settipo(char tipo){
        if(tipo=='d' || tipo=='s'){
            this.tipo= tipo;
        }
    }
    public void setvalor(double valor){
        this.valor = valor;
    }



    /**
     * @param tipo Tipo da operação, podendo ser 'd' ou 's'
     * @param valor Valor da operação
     */
    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
        settipo(tipo);
        setvalor(valor);
        setdata();
        NumOp++;
    }

    public void Extrato(){
        if (this.data != null) {
            System.out.println("Data: " + this.data + "Operação: " + this.tipo + "Valor: " + this.valor);
        }
        
    }

}