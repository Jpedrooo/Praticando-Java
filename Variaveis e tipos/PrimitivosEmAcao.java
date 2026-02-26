public class PrimitivosEmAcao {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double resultado = media(nota1, nota2, nota3);

        System.out.println("A média é: " + resultado);
        
    }

    public static double media(double n1, double n2, double n3){
            return (n1 + n2 + n3) / 3;
        }
}
