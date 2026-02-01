package day01022026;

public class simpleArray {

    public static void main(String[] args) {
        int sum = 0;
        int[] numOfArrays = {10, 20, 30, 40, 50, 12, 34, 42, 98, 334};

        System.out.println("All Elements in the Array:");
        
        for (int i = 0; i < numOfArrays.length; i++) {
          //  System.out.println("Element at Index " + i + ": " + numOfArrays[i]);
            sum += numOfArrays[i]; // Using shorthand for clarity
        }

        System.out.printf("Sum of array is: %d%n", sum);
    }
}