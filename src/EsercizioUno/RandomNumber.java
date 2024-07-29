package EsercizioUno;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        int[] array = new int[5];


        Random rand = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1, 10);
        }


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Array corrente:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            int numero = 0;
            int posizione = 0;

            try {

                System.out.println("Inserisci un numero (0 per uscire):");
                numero = Integer.parseInt(scanner.nextLine());


                if (numero == 0) {
                    break;
                }


                System.out.println("Inserisci la posizione (da 0 a 4):");
                posizione = Integer.parseInt(scanner.nextLine());


                if (posizione < 0 || posizione >= array.length) {
                    throw new ArrayIndexOutOfBoundsException("Posizione non valida.");
                }


                array[posizione] = numero;

            } catch (NumberFormatException e) {
                System.out.println(" Per favore inserisci un numero intero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}