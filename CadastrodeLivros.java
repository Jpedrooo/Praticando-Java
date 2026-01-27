import java.util.Scanner;

public class CadastrodeLivros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String titulo = leitor.nextLine();

        System.out.print("Digite sua autor: ");
        String autor = leitor.nextLine();

        System.out.println("Digite o numero de paginas: ");
        int numPag = leitor.nextInt();

        System.out.println("digite o preco do livro: ");
        double preco = leitor.nextDouble();

        leitor.nextLine();

        System.out.println("Categoria do livro:\n F - Ficção\n N - Não-ficção\n T - Tecnologia\n H - História");
        String categoria = leitor.nextLine();

        String resultCateg = categorizando(categoria);

        System.out.println("O livro é "+ titulo + ", o autor é " + autor + ", o numero de paginas é " + numPag + ", o preco é " + preco + "reais, e a categoria do livro é " + resultCateg );

        leitor.close();
    }

    public static String categorizando(String L1) {
    String categorico = "";
    
    switch (L1.toLowerCase()) { 
        case "f":
            categorico = "Ficção";
            break;
        case "n":
            categorico = "Não-ficção";
            break;
        case "t":
            categorico = "Tecnologia";
            break;
        case "h":
            categorico = "História";
            break;
        default:
            categorico = "Categoria não encontrada";
            break;
    } 
    
    return categorico; 
} 
}
