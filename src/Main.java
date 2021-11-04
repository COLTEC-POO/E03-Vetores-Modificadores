public class Main {
    public static void main (String[]args){

        //declaração das Contas
        Conta samuel=new Conta();
        Conta camila=new Conta();

        //inicialização das Contas
        samuel.setDono("Samuel");
        samuel.setNumero(1);
        //samuel.saldo=1000.00;
        samuel.setLimite(500);
        for(int i=0;i<1000;i++){//inicializa o atributo operacoes da conta com um valor padrao
            samuel.operacoes[i]=new Operacao('n',0);
        }

        camila.setDono("Camila");
        camila.setNumero(2);
        //camila.saldo=1500.00;
        camila.setLimite(1000);
        for(int i=0;i<1000;i++){//inicializa o atributo operacoes da conta com um valor padrao
            camila.operacoes[i]=new Operacao('n',0);
        }

        //imprimindo os dados das contas
        samuel.imprimir(samuel);
        camila.imprimir(camila);

        //depositando dinheiro na conta
        samuel.depositar(1500);
        camila.depositar(2500);

        //imprimindo os saldos atualizados das contas com os novos valores de deposito
        System.out.println("___Valor atualizado do saldo após depósito:___");
        System.out.println("Novo Saldo "+samuel.getDono()+":"+samuel.getSaldo());
        System.out.println("Novo Saldo "+camila.getDono()+":"+camila.getSaldo());

        //sacando dinheiro na conta
        samuel.sacar(100);
        camila.sacar(150);

        //imprimindo os saldos atualizados das contas com os novos valores de saque
        System.out.println("___Valor atualizado do saldo após saque:___");
        System.out.println("Novo Saldo "+samuel.getDono()+":"+samuel.getSaldo());
        System.out.println("Novo Saldo "+camila.getDono()+":"+camila.getSaldo());

        //transferindo dinheiro de Samuel para Camila
        samuel.transferir(camila,500.00);

        //imprimindo os saldos atualizados das contas após a transferencia de Samuel para Camila
        System.out.println("___Valor atualizado do saldo após transferencia:___");
        System.out.println("Novo Saldo "+samuel.getDono()+":"+samuel.getSaldo());
        System.out.println("Novo Saldo "+camila.getDono()+":"+camila.getSaldo());

        //imprimindo o Extrato das contas Samuel e Camila

        samuel.extrato(samuel);
        camila.extrato(camila);

        System.out.println("Total de contas:"+Conta.totalContas);

        System.out.println("Total de operações:"+Operacao.totalOperacoes);

        float media=Operacao.totalOperacoes/Conta.totalContas;

        System.out.println("Média de operações:"+media);
    }
}
