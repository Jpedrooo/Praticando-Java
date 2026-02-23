import java.util.Scanner;

public class ClassificarProdutos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preco do produto: ");
        Double preco = leitor.nextDouble();
        String categoria = "";

        if (preco < 50.00) {
            categoria = "Econômico";
        }
        else if (preco > 50.00 & preco < 200.00) {
            categoria = "Intermediario";
        }
        else{
            categoria = "Premium";
        }

        System.out.print("Categoria do produto: " + categoria);
        
        leitor.close();
    }
}
