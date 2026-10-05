import java.util.Scanner;

///
public class SistemaDeLogin {


    public static void main(String[] args) {
        int opcao = 0;
        int saldo = 2000;

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("==  Bem vindo ao Banco do Brasil ==\n");
        System.out.println("Crie sua senha");
        System.out.println("Registre sua senha:\n");
        String senha = sc.nextLine();
        System.out.println("Senha criada com sucesso\n");
        do {

            System.out.println("Digite sua senha");
            String senhaatual = sc.nextLine();

            if (senha.equals(senhaatual)) {

                System.out.println("Login feito com sucesso\n");
                System.out.println("O que deseja fazer:\n1 - Saldo | 2 - Sacar  |  3 - Sair");
                int escolha = sc.nextInt();

                switch (escolha){

                    case 1:
                        System.out.println("Saldo: " + saldo);
                        break;

                    case 2:
                        System.out.println("Quantos deseja sacar?");
                        int sacar = sc.nextInt();

                        if(sacar>saldo){
                            System.out.println("Saldo insuficiente");
                        } else if(sacar == 0){
                            System.out.println("Erro! Valor invalido");
                        }
                         else{
                        int novoSaldo = saldo - sacar;
                        System.out.println("O seu novo saldo é: " + novoSaldo);}
                        break;

                    case 3:
                        System.out.println("Saindo. . .");
                        break;

                    default:
                        System.out.println("Arrego se ta fazendo coisa errada ai");

                }

            } else System.out.println("Você errou sua senha");
            opcao = sc.nextInt();

        } while (opcao != 3);
        System.out.println("Programa encerrado com sucesso!");


        sc.close();
    }
}