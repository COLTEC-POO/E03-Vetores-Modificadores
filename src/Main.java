public class Main {
        public static void main (String[] args){

            Cliente vinicius = new Cliente();
            Cliente maria = new Cliente();

            vinicius.nome = "Vinicius";
            vinicius.cpf = "12772452744";
            vinicius.idade = 32;
            vinicius.endereco = "COLTEC - UFMG";
            vinicius.sexo = 'm';

            maria.nome = "Maria";
            maria.cpf = "09901364688";
            maria.idade = 30;
            maria.endereco = "FAE - UFMG";
            maria.sexo = 'f';

            Conta c1 = new Conta();
            Conta c2 = new Conta();


            c1.setDono(vinicius);
            c1.setNumero(195672);
            c1.setLimite(20000);



            c2.setDono(maria);
            c2.setNumero(2123718);
            c2.setLimite(35000);

            c1.depositar(5000);
            c1.transferir(c2, 1500);
            c2.depositar(7000);

            //System.out.println("C1: " + c1.numOperacoes);
            //System.out.println("C2: " + c2.numOperacoes);

            c1.imprimir();
            System.out.println();
            c2.imprimir();
            System.out.println();
            c1.imprimirExtrato();
            System.out.println();
            c2.imprimirExtrato();
            System.out.println();
            System.out.println();
            System.out.println("Total de Contas: " + Conta.TOTAL_CONTAS);
            System.out.println("Total de Contas: " + Operacao.TOTAL_OPERACOES);

        }
}
