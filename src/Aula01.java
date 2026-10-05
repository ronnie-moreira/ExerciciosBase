public class Aula01 {
public  static void main(String[] args) {


        String [] produtos = {"Arroz", "Feijão", "Café", "Açucar", "Leite"};
        int [] estoque = {5, 10, 20,30,40};
        int [] estoqueminimo = {1,2,3,4,5};

        for (int i = 0; i < produtos.length ; i++) {
            System.out.println("Produtos: " + produtos[i] + "| Estoque: "+ estoque[i] + "| Estoque Mínimo:" + estoqueminimo[i]);


        }

    }
}
