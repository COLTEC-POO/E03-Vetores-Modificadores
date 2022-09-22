
public class Conta{

    //----------------------------------------- Atribultos Classe ------------------------------------------------//

    //Numero de Contas Abertas:
    private static Integer numContasCriadas = 0;

    private static Integer numMaxOperacoesArmazenadas = 1000;


    private int nOperacoesConta = 0;

    //Numero da Conta:
    private Integer numConta;

    //Titular:
    private Cliente dadosCliente;

    //Limite Credito Conta:
    private double limite;

    //Saldo Disponivel:
    private double saldo;

    //Extrato de Operações - Maximo de 1000 operações salvas.
    private Operacao[] operacoes = new Operacao[numMaxOperacoesArmazenadas];

    //---------------------------------------- Fim Atribultos Classe ---------------------------------------------//


    //------------------------------------------ Metodo Construtor -----------------------------------------------//

    /**
     * Metodo Construtor - Quando Incializada a classe, é chamada para criar uma nova conta com valores padrões.
     * EX:
     *      Conta var = new Conta();
     */
    public Conta(){
        System.out.println("\nBEM VINDO - AO SISTEMA BANCARIO");
        System.out.println("VAMOS INICIA SUA CONTA: ");

        this.operacoes[0] = new Operacao();
        this.dadosCliente = new Cliente();
        this.numConta = numContasCriadas + 1000;
        this.limite = 0;
        this.saldo = 0;
        this.nOperacoesConta = 0;
        setNumContasCriadas(this.getNumContasCriadas() + 1);
    }

    //---------------------------------------- Fim Metodo Construtor ---------------------------------------------//


    //--------------------------------------------- Metodos Get --------------------------------------------------//

    /**
     * Metodo para ler numero da conta
     * @return numero da conta.
     */
    private Integer getNumConta() {
        return this.numConta;
    }

    /**
     * Metodo para ler dados cliente.
     * @return dados do cliente.
     */
    private Cliente getDadosCliente() {
        return this.dadosCliente;
    }

    /**
     * Metodo para ler limite da conta.
     * @return limite de credito.
     */
    private double getLimite() {
        return this.limite;
    }

    /**
     * Metodo para ler saldo da conta.
     * @return saldo disponivel.
     */
    private double getSaldo() {
        return this.saldo;
    }

    /**
     * Metodo para ler numero de contas criadas.
     * @return numero de contas criadas.
     */
    public Integer getNumContasCriadas() {
        return numContasCriadas;
    }

    /**
     * Metodo para acessar numero de operações realizadas.
     * @return Retorna numero de operacoes realizadas
     */
    public int nOperacoesRealizadas(){
        return (this.operacoes[0].getnOperacoes());
    }

    public int getnOperacoesConta() {
        return nOperacoesConta;
    }

    //-------------------------------------------- Fim Metodos Get -----------------------------------------------//


    //----------------------------------- Metodos Set || Alterações de Valores: ----------------------------------//

    /**
     * Metodo para realizar o deposito de um valor x;
     * EX:
     *      boolean retorno = depositar(1500) //Para depositar R$1500;
     *
     * @param valor valor a ser depositado.
     * @return true = caso deposito realizado // false = caso ocorra erro.
     */
    public boolean depositar(double valor){
        boolean VALOR_VALIDO;

        VALOR_VALIDO = (valor > 0);

        if(VALOR_VALIDO) {
            this.saldo += valor;

            this.operacoes[this.getnOperacoesConta()] = new Operacao('d',valor); //Armazena a operação no extrato.
            this.setnOperacoesConta(getnOperacoesConta() + 1);
            System.out.println("\nDEPOSITO REALIZADO COM SUCESSO");
            imprimirExtrato();

            return true;
        }else {
            System.out.println("\nIMPOSSIVEL REALIZAR OPERAÇÃO");
            return false;
        }
    }

    /**
     * Função para realizar saque da conta de um valor x.
     * EX:
     *      boolean retorno = sacar(1500) //Para sacar R$1500;
     *
     *  @param valor valor a ser sacado.
     * @return true = caso valor sacado // false = caso ocorra erros.
     */
    public boolean sacar(double valor){
        boolean SALDO_INSUFICIENTE, VALOR_INVALIDO;

        VALOR_INVALIDO = (valor < 0);
        SALDO_INSUFICIENTE = (valor > getSaldo());

        if(SALDO_INSUFICIENTE){
            System.out.println("\nSALDO INSUFICIENTE");
            return false;
        }else if(VALOR_INVALIDO){
            System.out.println("\nVALOR INVALIDO");
            return false;
        }else{
            this.saldo -= valor;

            this.operacoes[this.getnOperacoesConta()] = new Operacao('s', valor);
            setnOperacoesConta(getnOperacoesConta() + 1);
            System.out.println("\nSAQUE REALIZADO COM SUCESSO");
            imprimirExtrato();

            return true;
        }
    }

    /**
     * Função para realizar transferência de um valor x entre contas.
     * EX:
     *      boolean retorno = trasferir(ContaX, 1500) //Para transferir R$1500 para conta X;
     *
     * @param destino Endereço Conta destino.
     * @param valor Valor a ser tranferido
     * @return true = se tranferencia realizada // false = caso ocorra erros.
     */
    public boolean tranferencia(Conta destino, double valor){
        boolean retorno;


        if(valor < this.getSaldo()){

            System.out.println("\nTRANSFERINDO R$ " + valor + " PARA " + destino.dadosCliente.getNome());
            retorno = sacar(valor); //Tenta realizar o saque do valor.

            if(retorno) {

                retorno = destino.depositar(valor); // Se sacou, tenta depositar na conta destino.

                if (retorno) {
                    System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO");
                    return true; //Se conseguiu depositar retorna.
                }else{
                    this.depositar(valor); //Se não conseguir depositar no destino retorna valor para conta.
                }
            }

            //Exibe mensagem de erro para o usuario.
            System.out.println("ERRO NA OPERAÇÃO - TENTE NOVAMENTE MAIS TARDE");

        }else {
            System.out.println("VALOR INSUFICIENTE");
        }

        return false;//Retorno falso, não conseguindo realizar a operação por erro de saldo ou transferencia.
    }

    public void setnOperacoesConta(Integer nOperacoesConta) {
        this.nOperacoesConta = nOperacoesConta;
    }

    public static void setNumContasCriadas(Integer numContasCriadas) {
        Conta.numContasCriadas = numContasCriadas;
    }

    //-------------------------------- Fim Metodos Set || Alterações de Valores: ---------------------------------//


    //----------------------------------------- Metodos Exibir Dados ---------------------------------------------//

    /**
     * Metodo para exibir dados simples da conta. Titular / Numero Conta
     */
    public void exibirDadosConta(){
        System.out.println("TITULAR: " + this.dadosCliente.getNome());
        System.out.println("CONTA: " + this.getNumConta());
    }

    /**
     * Metodo para exibir dados detalhados da conta. Dados Titular / Dados da Conta / Valores / Operacoes
     */
    public void exibirDadosDetalhado(){
        exibirDadosConta();
        System.out.println("CPF: " + this.dadosCliente.getCPF());
        System.out.println("ENDERECO: " + this.dadosCliente.getEndereco());
        System.out.println("CLIENTE DESDE: " + this.operacoes[0].getData());
        System.out.println("SALDO: " + this.saldo);
        System.out.println("LIMITE: " + this.limite);
        System.out.println("N° OPERACOES REALIZADAS: " + this.getnOperacoesConta());
    }

    /**
     * Metodo para exibir o saldo disponivel em conta.
     */
    public void exibirSaldo(){
        exibirDadosConta();
        System.out.println("SALDO: " + this.getSaldo());
    }

    /**
     * Metodo para exibir o limite de credito da conta.
     */
    public void exibirLimite(){
        exibirDadosConta();
        System.out.println("SALDO: " + this.getLimite());
    }

    /**
     * Metodo para exibir ultima operação realizada na conta.
     */
    public void imprimirExtrato(){
        exibirDadosConta();
        System.out.println("DATA: " + this.operacoes[this.getnOperacoesConta() - 1].getData() +
                    " TIPO: "+ ((this.operacoes[this.getnOperacoesConta() - 1].getTipo() == 's')? "SAQUE": "DEPOSITO") +
                    " VALOR: " + this.operacoes[this.getnOperacoesConta() - 1].getValor());
    }

    /**
     * Metodo para exibir todas as operações realizadas pela conta - limite 1000.
     */
    public void imprimirExtratoDetalhado(){
        int i;
        boolean SEM_DADOS;

        SEM_DADOS = (this.operacoes[0].getnOperacoes() == 0);

        if(SEM_DADOS){
            System.out.println("SEM REGISTROS DE OPERAÇÕES");
        }else{
            System.out.println("\nEXTRATO DETALHADO");
            exibirDadosDetalhado();

            for(i = 0; i < this.getnOperacoesConta(); i++){
                System.out.println("DATA: " + this.operacoes[i].getData() +
                        " TIPO: "+ ((this.operacoes[i].getTipo() == 's')? "SAQUE": "DEPOSITO") +
                        " VALOR: " + this.operacoes[i].getValor());
            }
        }
    }

    //--------------------------------------- Fim Metodos Exibir Dados -------------------------------------------//
}