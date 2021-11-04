import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double media;
        byte Menu;

        Cliente[] clientes = new Cliente[2];
        Conta[] contas = new Conta[2];

        for (int i = 0; i < 2; i++){
            contas[i] = new Conta();
        }

        for (int i = 0; i < 2; i++){
            clientes[i] = new Cliente();
        }

        contas[0].setMemoryId(1);
        contas[0].setMemoryLimite(85000);
        clientes[0].idade = 20;
        clientes[0].cpf = "164-192-554-888-54";
        clientes[0].endereco = "Rua: Sinuka - Numero: 915 - Bairro: Diamantina";
        clientes[0].sexo = 'M';
        clientes[0].nome = "Taldo Sidoka";

        contas[1].setMemoryId(2);
        contas[1].setMemoryLimite(26000);
        clientes[1].idade = 19;
        clientes[1].cpf = "154-456-789-156-78";
        clientes[1].endereco = "Rua: Sukata - Numero: 456 - Bairro: Diamantina";
        clientes[1].sexo = 'F';
        clientes[1].nome = "Renatinha";


//-----------------------------------------------------------------------------------------------------//
        do {
            System.out.println();
            System.out.println("------------------");
            System.out.println("- Banco Intactoz -");
            System.out.println("------------------");
            System.out.println("1- Dados Clientes");
            System.out.println("2- Deposito");
            System.out.println("3- Saque");
            System.out.println("4- Transferência");
            System.out.println("5- Media");
            System.out.println("6- Extrato");
            System.out.println("7- Exit");
            System.out.println("------------------");
            System.out.print("Digite a opção desejada: ");
            Menu = input.nextByte();
            System.out.println();

            switch (Menu) {
                case 0:
                    break;
                case 1: {
                    for(int i = 0; i < contas.length; i++){
                            System.out.println("------------------------------------------------");
                            System.out.println("Informações da conta");
                            System.out.println("------------------------------------------------");
                            System.out.println("ID:"+contas[i].getMemoryId());
                            System.out.println("Nome:"+clientes[i].nome);
                            System.out.println("Saldo:" + contas[i].getSaldo());
                            System.out.println("Limite:" + contas[i].getLimite());
                            System.out.println("CPF:" +clientes[i].cpf);
                            System.out.println("Idade:" +clientes[i].idade);
                            System.out.println("Sexo:" +clientes[i].sexo);
                            System.out.println("Endereço:" +clientes[i].endereco);
                            System.out.println("------------------------------------------------");
                            System.out.println("Aviso: Evite fraudes, não compartilhe seus dados");
                            System.out.println("------------------------------------------------");
                    }

                    break;
                }
                case 2: {
                    //Função para depositar dinheiro na conta dos clientes
                    contas[0].depositar(1250000.00);
                    contas[1].depositar(1350000.00);

                    //Imprimindo os novos saldos apos deposito
                    System.out.println("----------Banco Intactoz---------");
                    System.out.println("Deposito realizado com Sucesso!");
                    System.out.println("          ------------          ");
                    System.out.println("Dados Atualizados apos deposito:");
                    System.out.println("----------------------------------");
                    System.out.println("Novo Saldo "+clientes[0].nome+":"+contas[0].getSaldo());
                    System.out.println("Novo Saldo "+clientes[1].nome+":"+contas[1].getSaldo());
                    System.out.println("----------------------------------");
                    break;
                }
                case 3: {
                    //Função para sacar dinheiro na conta dos clientes
                    contas[0].sacar(100000.00);
                    contas[1].sacar(250000.00);;

                    //Imprimindo dados apos saque
                    System.out.println("----------Banco Intactoz---------");
                    System.out.println("Saque realizado com Sucesso!");
                    System.out.println("          ------------          ");
                    System.out.println("Dados Atualizados apos saque:");
                    System.out.println("----------------------------------");
                    System.out.println("Novo Saldo "+clientes[0].nome+":"+contas[0].getSaldo());
                    System.out.println("Novo Saldo "+clientes[1].nome+":"+contas[1].getSaldo());
                    System.out.println("----------------------------------");
                    break;
                }
                case 4: {
                    //Função para transferir dinheiro entre os clientes
                    contas[0].transferir(contas[1],50000.00);

                    //Imprimindo os dados apos transferir
                    System.out.println("----------Banco Intactoz---------");
                    System.out.println("Transferência realizado com Sucesso!");
                    System.out.println("          ------------          ");
                    System.out.println("Dados Atualizados apos transferência:");
                    System.out.println("----------------------------------");
                    System.out.println("Novo Saldo "+clientes[0].nome+":"+contas[0].getSaldo());
                    System.out.println("Novo Saldo "+clientes[1].nome+":"+contas[1].getSaldo());
                    System.out.println("----------------------------------");

                    break;
                }
                case 5: {
                    media = Operacao.totalOperacoes / Conta.totalContas;
                    System.out.println("---------------------------Banco Intactoz-----------------------------");
                    System.out.println("Media do numero de operações em relação ao numero de contas: " + media);
                    System.out.println("----------------------------------------------------------------------");
                    break;
                }
                case 6:{
                    System.out.println("----------Banco Intactoz---------");
                    contas[0].imprimirExtrato();
                    System.out.println("----------------------------------");
                    contas[1].imprimirExtrato();
                    break;
                }
                case 7: {
                    System.out.println("Saindo do Banco Intactoz...");
                    System.exit(0);
                }
                default: {
                    System.out.println("Error: Você escolheu uma opção invalida...");
                }
            }
        } while (Menu != 7);

//-----------------------------------------------------------------------------------------------------//

    }
}
