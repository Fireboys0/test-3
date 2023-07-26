import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("WOW");
        first();
    }
     static void first() {
        Scanner abc = new Scanner(System.in);
        System.out.println("Votre couleur préférer ?");
        String a = abc.nextLine();
        System.out.println("Votre couleur préférer est le "+a);

    }
}
