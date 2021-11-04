public class Main {
    public static void main (String[]args){

        //declaração dos Clientes
        Cliente Samuel=new Cliente();
        Cliente Camila=new Cliente();

        //inicialização dos Clientes
        Samuel.nome="Samuel";
        Samuel.cpf="000.000.996-1";
        Samuel.endereco="Rua D,20 -São José";
        Samuel.idade=37;
        Samuel.sexo='m';

        Camila.nome="Camila";
        Camila.cpf="000.000.887-2";
        Camila.endereco="Rua Gomes,50 -São José";
        Camila.idade=30;
        Camila.sexo='f';

        //declaração das Contas
        Conta samuel=new Conta();
        Conta camila=new Conta();

        //inicialização das Contas
        samuel.dono=Samuel;
        samuel.numero=1;
        samuel.saldo=1000.00;
        samuel.limite=500.00;
        for(int i=0;i<1000;i++){//inicializa o atributo operacoes da conta com um valor padrao
            samuel.operacoes[i]=new Operacao('n',0);
        }

        camila.dono=Camila;
        camila.numero=2;
        camila.saldo=1500.00;
        camila.limite=1000.00;
        for(int i=0;i<1000;i++){//inicializa o atributo operacoes da conta com um valor padrao
            camila.operacoes[i]=new Operacao('n',0);
        }

        //imprimindo os dados das contas
        samuel.imprimir(samuel);
        camila.imprimir(camila);

        //depositando dinheiro na conta
        samuel.depositar(350);
        camila.depositar(125);

        //imprimindo os saldos atualizados das contas com os novos valores de deposito
        System.out.println("___Valor atualizado do saldo após depósito:___");
        System.out.println("Novo Saldo "+samuel.dono.nome+":"+samuel.saldo);
        System.out.println("Novo Saldo "+camila.dono.nome+":"+camila.saldo);

        //sacando dinheiro na conta
        samuel.sacar(50);
        camila.sacar(70);

        //imprimindo os saldos atualizados das contas com os novos valores de saque
        System.out.println("___Valor atualizado do saldo após saque:___");
        System.out.println("Novo Saldo "+samuel.dono.nome+":"+samuel.saldo);
        System.out.println("Novo Saldo "+camila.dono.nome+":"+camila.saldo);

        //transferindo dinheiro de Samuel para Camila
        samuel.transferir(camila,500.00);

        //imprimindo os saldos atualizados das contas após a transferencia de Samuel para Camila
        System.out.println("___Valor atualizado do saldo após transferencia:___");
        System.out.println("Novo Saldo "+samuel.dono.nome+":"+samuel.saldo);
        System.out.println("Novo Saldo "+camila.dono.nome+":"+camila.saldo);

        //imprimindo o Extrato das contas Samuel e Camila

        samuel.extrato(samuel);
        camila.extrato(camila);


    }
}
