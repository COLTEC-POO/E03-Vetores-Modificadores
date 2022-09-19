public class Conta {

    //atributos
    private static Integer qtdContas = 0;

    private static Integer qtdOperacoes = 1001;

    private Cliente cliente;
    private Integer numConta;
    private Double saldo;
    private Double limite;
    private Boolean tipo;
    private Operacao[] operacoes = new Operacao[qtdOperacoes];


    // Construct para iniciar a conta

    /**
     * @param cliente
     * @param tipo
     * @param saldo_inicial
     * @param limite
     * @param numConta
     */
    public Conta(Cliente cliente, Boolean tipo, Double saldo_inicial, Double limite, Integer numConta){
        try{
            validaCliente(cliente);
            validaTipo(tipo);
            validaSaldo(saldo_inicial);
            validaLimite(limite);
            validaNumConta(numConta);
            operacoes[0] = new Operacao();
            qtdContas++;
        }catch (Exception e) {
            System.out.println("Dados invalidos!");
        }
    }

    public Conta(){
        
    }

    //Getters
    public Cliente cliente(){
        return this.cliente;
    }

    public Boolean getTipo(){
        return this.tipo;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public Double getLimite(){
        return this.limite;
    }

    public Integer getNumConta(){
        return this.numConta;
    }

    public Double getMedia(){
        return 1.0 * operacoes[0].getNOperacao() / qtdContas;
    }
    //FIM Getters

    //Setters
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setTipo(Boolean tipo){
        this.tipo = tipo;
    }

    public void setSaldoInicial(Double saldo){
        this.saldo = saldo;
    }

    public void setLimite(Double limite){
        this.limite = limite;
    }

    public void setNumConta(Integer numConta){
        this.numConta = numConta;
    }
    //FIM Setters

    //Validadores de dados
    private void validaCliente(Cliente cliente){
        setCliente(cliente);
    }

    private void validaTipo(Boolean tipo){
        setTipo(tipo);
    }

    private void validaSaldo(Double saldo){
        if (saldo >= 0)
            setSaldoInicial(saldo);
    }

    private void validaLimite(Double limite){
        if (limite >= 0)
            setLimite(0.0);
    }

    private void validaNumConta(Integer numConta){
        setNumConta(numConta);
    }
    //FIM Validadores


    //Operações com as contas
    public void imprimirSaldo() {
        System.out.println("Conta " + this.numConta);
        System.out.println("Saldo: R$" + this.saldo);
    };

    public Boolean sacar(Double valor, char tipo) {
      if (valor > saldo || valor < 0) {
          return false;
      } else {
          this.saldo-= valor;
          System.out.println("Valor sacado: R$" + valor);
          System.out.println("Novo Saldo: R$" + this.saldo);
          operacoes[operacoes[0].getNOperacao() + 1] = new Operacao(tipo, valor); 
          return true;
      }
    }

    public Boolean depositar(Double valor, char tipo) {
        if (valor < 0){
            return false;
        } else {
            this.saldo += valor;
            System.out.println("Valor depositado: R$" + valor);
            System.out.println("Novo Saldo: R$" + this.saldo);
            operacoes[operacoes[0].getNOperacao() + 1] = new Operacao(tipo, valor); 
            return true;
        }
    }

    public Boolean transferir(Conta destino, Double valor) {
        if (this.sacar(valor, 's')) {
            destino.depositar(valor, 'd');
            return true;
        } else {
            System.out.println("Transferencia incompleta, saldo disponivel: R$" + this.saldo);
            return false;
        }
    }

    public void mostraConta(){
        System.out.println("Conta " + this.numConta);
        System.out.println("Proprietário " + this.cliente.getNome() + " CPF: " + this.cliente.getCPF());
        System.out.println("Saldo: R$" + this.saldo + " Limite: R$ " + this.limite);
    }

    public void mostraConta(Boolean compelta){
        System.out.println("Conta " + this.numConta);
        System.out.println("Saldo: R$" + this.saldo + " Limite: R$ " + this.limite);
        cliente.mostraCliente();
    }

    public void mostraExtrato(){
        System.out.println("Conta " + this.numConta);
        if (operacoes[0] != null){
            for (Operacao o : operacoes){
                if (o!= null){
                    o.extrato();
                    //System.out.println(o);
                }
            }
            System.out.println("Saldo: R$ " + this.saldo);
        }
        else{
            System.out.println("Não há operações");
        }
    }
    //FIM Operações com as contas

}