package exerciciosbase;

import java.util.Scanner;

public class TesteFilme {

    public static void main(String[] args) {

        Scanner shaba = new Scanner (System.in);

        System.out.println("Digite o nome do filme:");
        String nome = shaba.nextLine();

        System.out.println("Digite o gênero do filme: ");
        String genero = shaba.nextLine();

        System.out.println("O filme está alugado? (S/N) ");
        char resposta = shaba.next().charAt(0);

        boolean alugado = resposta == 'S'  || resposta == 's';
        System.out.println();
        System.out.println("================DADOS DO FILME================");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);


        if(alugado){

    System.out.println("Status: Alugado");

}else{

    System.out.println("Status: Disponivel");
}



shaba.close();
    }
}
