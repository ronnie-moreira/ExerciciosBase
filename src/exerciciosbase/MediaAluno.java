package exerciciosbase;

import java.util.Scanner;

public class MediaAluno {

    static void main(String[] args) {
            System.out.println("Bem vindo ao calculo de Média do Aluno\n");
            System.out.println("=======================================");
             Scanner sc = new Scanner(System.in);
             Scanner sc1 = new Scanner(System.in);
                int nota1, nota2, nota3, nota4, media;


        System.out.println("Qual seu nome?\n");
        String nome = sc.nextLine();
        System.out.println("Quais foram suas notas?");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();
        nota4 = sc.nextInt();

        media = nota1 + nota2 + nota3 + nota4;

                 media = media / 4;

        System.out.println("O aluno: " + nome + " conseguiu uma média de: " + media );

        if (media > 6){

            System.out.println("Você dançou " + nome);
        } else if(media >= 6 ) {

            System.out.println("Você passou " + nome);
        }

    }
}
