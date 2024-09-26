import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        double altura= 30.256;
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", altura);
    }
}