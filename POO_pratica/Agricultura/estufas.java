package POO_pratica.Agricultura;

public class estufas {
    public static void main(String[] args) {
        local local1 = new local();
        local1.setor = "Agro ";
        local1.temperatura = 50.0;

        local1.exibirInformacoes();
        local1.temperaturaformatada();
        local1.temperaturaAlta();
    }
}
