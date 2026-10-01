import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] inputArray1 = {15000, 22000, 18000, 30000, 25000}; // Задача 1
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int payment : inputArray1) {
            sum += payment;
        }
        for (int payment : inputArray1) {
            if (payment > max) {
                max = payment;
            }
        }
        for (int payment : inputArray1) {
            if (payment < min) {
                min = payment;
            }
        }
        float average = (float) sum / inputArray1.length;
        float[] outputArray1 = {
                sum,
                max,
                min,
                average
        };
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        System.out.println();

        int[] inputArray2 = {30000, 45000, 50000, 60000, 75000}; // Задача 2
        float[] outputArray2 = new float[inputArray2.length];
        int index2 = 0;
        for (int payment : inputArray2) {
            outputArray2[index2] = payment * 0.13f;
            index2++;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        System.out.println();

        int[] inputArray3 = {3000, 7000, 5000, 8500, 4500}; // Задача 3
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3] = bonus > 5000;
            index3++;
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        System.out.println();

        int[] inputArray4 = {10000, 5000, 2000, -1000, 3000}; // Задача 4
        boolean result4 = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                result4 = false;
                break;
            }
        }
        boolean[] outputArray4 = {result4};
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        System.out.println();

        int[] inputArray5 = {50000, -10000, 30000, 0, 70000}; // Задача 5
        int profitableMonths = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths++;
            }
        }
        int[] outputArray5 = {profitableMonths};
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));

    }
}