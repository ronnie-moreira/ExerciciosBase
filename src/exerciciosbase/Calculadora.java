package exerciciosbase;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int soma;
        String escolha = "S";
        System.out.println("--------- Calculadora do Ronnie ---------\n");
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Digite o primeiro número:\n");
            int res1 = sc.nextInt();

            System.out.println("Digite o segundo número:\n");
            int res2 = sc.nextInt();


            System.out.println("Qual operação deseja fazer? sendo elas : + |  -  |  /  |  *  |\n");
            sc.nextLine();
            String opcao = sc.nextLine();

            switch (opcao) {

                case "+":
                    soma = res1 + res2;
                    System.out.println("A soma dos dois números é: " + soma);
                    break;

                case "-":
                    soma = res1 - res2;
                    System.out.println("A subtração dos dois números é: " + soma);
                    break;

                case "/":
                    if (res2 == 0) {
                        System.out.println("Erro, número não pode ser divisivel por 0\n");
                        break;
                    }
                    soma = res1 / res2;
                    System.out.println("A divisão dos dois números é: " + soma);
                    break;

                case "*":
                    soma = res1 * res2;
                    System.out.println("A multiplicação dos dois números é: " + soma);
                    break;

                default:
                    System.out.println("Erro de operação");

            }
            System.out.println("Deseja fazer outra conta? : (S/N)");
            escolha = sc.next();
            System.out.println();

        } while(escolha.equalsIgnoreCase("S"));
        System.out.println("Encerrando o Programa . . .");
        sc.close();

    }
}
