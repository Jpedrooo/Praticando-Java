package POO_pratica.Empresa;

public class Cad_colaboradores {
    public String nome;
    public String cargo;
    public int nivel_de_acesso;

    void alterarcargo(String Novocargo){
         this.cargo = Novocargo;

         System.out.printf("O novo cargo do %s é: %s\n", nome,  cargo);
         
    }

    void alteralNivel(int NovoNivel){
        this.nivel_de_acesso = NovoNivel;

         System.out.printf("O novo nivel de acesso é %d\n", nivel_de_acesso);
        
    }
}
