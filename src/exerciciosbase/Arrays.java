package exerciciosbase;

public class Arrays {

   public static void main(String[] args) {

        int[] numeros = {14, 32, 5, 99, 23, 8, 42 };
        int menor = numeros[0];
        int maior = numeros[0];
        float media = 0;

            for (int i = 0;  i < numeros.length ; i++) {

                media += numeros[i];

                if(numeros[i] < menor){
                    menor = numeros[i];
                 }

                if(numeros[i] > maior) {
                 maior = numeros[i];
                 }



        }
        media = media / numeros.length;
            System.out.println("");
                System.out.println("A média dos Arrays é: " + media);
                    System.out.println("o Maior valor é: " +maior);
                        System.out.println("O menor valor é: " + menor);

   }
}
