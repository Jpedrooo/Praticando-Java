package Encapsulamento.Laboratorio;
import java.util.Scanner;

public class validador {
    private String login;
    private String senha;
    private Scanner scanner = new Scanner(System.in);

    public void request(){
        System.out.println("Digite seu novo usuario:");
        this.login = scanner.nextLine();

        System.out.println("Digite sua nova senha:");
        this.senha = scanner.nextLine();
    }

    public void logar() {
    for (int i = 3; i > 0; i--) {
        System.out.println("Digite seu usuario:");
        String userDigitado = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String passDigitado = scanner.nextLine();

        
        if (userDigitado.equals(this.login) && passDigitado.equals(this.senha)) {
            System.out.println("Login bem-sucedido!");
            return;
        } else {
            System.out.println("Incorreto. Tentativas restantes: " + (i - 1));
        }
    }
    System.out.println("Conta bloqueada!");
}
}
