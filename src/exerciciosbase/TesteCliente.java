package exerciciosbase;

import java.util.Scanner;

public class TesteCliente {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         Cliente cliente = new Cliente();
         // Declara uma referencia e cria uma nova obejto Cliente com o new

         System.out.println("Digite o nome do cliente: \n");
         cliente.nome = sc.nextLine();

         System.out.println("Digite o numero do telefone do cliente:\n");
         cliente.telefone = sc.nextLine();

         System.out.println("------CLIENTE CADASTRADO------");
         System.out.println("Nome: " + cliente.nome);
         System.out.println("Telefone: " + cliente.telefone );
         System.out.println();

        Cliente cliente2 = new Cliente();
         System.out.println("Digite o nome do cliente: \n");
         cliente2.nome = sc.nextLine();

         System.out.println("Digite o numero do telefone do cliente:\n");
         cliente2.telefone = sc.nextLine();

         System.out.println("------CLIENTE CADASTRADO------");
         System.out.println("Nome: " + cliente2.nome);
         System.out.println("Telefone: " + cliente2.telefone);
         System.out.println();




         sc.close();

    }
}
