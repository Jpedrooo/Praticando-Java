package POO_pratica.Empresa;

import java.util.Scanner;

public class empresa {
    public static void main(String[] args) {
        Cad_colaboradores funcionario1 = new Cad_colaboradores();
        funcionario1.nome = "João";
        funcionario1.cargo = "estagiario";
        funcionario1.nivel_de_acesso = 0;

        Cad_colaboradores func2 = new Cad_colaboradores();
        func2.nome = "Maria";
        func2.cargo = "Gerente";
        func2.nivel_de_acesso = 5;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o novo cargo ");
        String Novocargo = leitor.nextLine();

        System.out.print("Digite o novo nivel de acesso ");
        int NovoNivel = leitor.nextInt();

        funcionario1.alterarcargo(Novocargo);
        funcionario1.alteralNivel(NovoNivel);

        leitor.close();

    }
}

