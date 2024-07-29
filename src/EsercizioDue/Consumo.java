package EsercizioDue;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("inserisci chilometri percorsi  ");
            int km = scanner.nextInt();

            System.out.println("inserisci litri consumati: ");
            int l = scanner.nextInt();

            int kmL = km / l;
            System.out.println("consumo : " + kmL);
        } catch
        (NumberFormatException e) {
            System.out.println("Inserisci un numero intero");
        } catch (ArithmeticException e) {
            System.out.println("inserisci un numero maggiore di 0");
        } finally {
            scanner.close();
        }
    }
}