public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        int celsius = 20;

        double conversao = Fahrenheit(celsius);

        System.out.println(conversao);

    }

    public static double Fahrenheit(int n1){
        return (n1 * 9 / 5) + 32;
    }
}
