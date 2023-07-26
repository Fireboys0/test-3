import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("WOW");
        first();
    }
    static void first () {
        Scanner abc = new Scanner(System.in);
        System.out.println("Quel est votre nombre préférer ?");
        int a = abc.nextInt();
        System.out.println("Votre nombre préférer est le nombre " + a);
    }
}