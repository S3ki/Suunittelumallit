package Viikko7.Strategy;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AlgoContext context = new AlgoContext();
        AlgoStrategy strategy = null;
        Scanner scanner = new Scanner(System.in);

        int[] smallArray = generateRandomArray(30);

        int[] largeArray = generateRandomArray(100000);

        int choice = 0;
        while (true) {

            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Choose a sorting algorithm: ");
            System.out.println("1. Selection Sort");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Pigeonhole Sort");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-3): ");

             choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    strategy =  new SelectionSort();
                    System.out.println("You selected Selection Sort.");
                    break;
                case 2:
                    strategy = new BubbleSort();
                    System.out.println("You selected Bubble Sort.");
                    break;
                case 3:
                    strategy = new PigeonHoleSort();
                    System.out.println("You selected Pigeonhole Sort.");
                    break;
                case 4:
                    System.out.println("Exiting program... ");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    continue;
            }
            if (strategy != null) {
                context.setStrategy(strategy);

                // Ajaa algot valitulla strategialla/algolla ja tulostaa ajat
                testSortingStrategy("the selected Strategy", smallArray, largeArray, context);

            }

        }

    }
    // Asettaa koon arraylle ja populoi sen 0-1000 satunnaisilla arvoilla jokaiseen alkioon ja sitten palauttaa sen arrayn
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    // Valinnan jälkeen tarkistaa algoritmi strategian ja tulosta ajat molemmille
    public static void testSortingStrategy(String strategyName, int[] smallArray, int[] largeArray, AlgoContext context) {
        System.out.println("Running " + strategyName + " on small array...");
        long startTime = System.nanoTime();
        context.sort(smallArray);
        long endTime = System.nanoTime();
        System.out.println(strategyName + " took " + (endTime - startTime) / 1000000.0 + " s for small array.");

        System.out.println("Running " + strategyName + " on large array...");
        startTime = System.nanoTime();
        context.sort(largeArray);
        endTime = System.nanoTime();
        System.out.println(strategyName + " took " + (endTime - startTime) / 1000000000.0 + " s for large array.");
        System.out.println();
    }
}
