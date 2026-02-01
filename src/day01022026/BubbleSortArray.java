package day01022026;

public class BubbleSortArray {

	public static void main(String[] args) {

		int[] numOfArrays = { 10, 20, 30, 40, 50, 12, 34, 42, 98, 334 };

		System.out.println("All Elements in the Array:");

		System.out.println("Array before Sorting");
		for (int i = 0; i < numOfArrays.length; i++) {

			System.out.println(numOfArrays[i]);

		}

		for (int j = 0; j < numOfArrays.length - 1; j++) {

			for (int p = 0; p < numOfArrays.length - 1; p++) {
				if (numOfArrays[p] > numOfArrays[p + 1]) {
					int temp = numOfArrays[p];
					numOfArrays[p] = numOfArrays[p + 1];
					numOfArrays[p + 1] = temp;

				}

			}
		}

		System.out.println("Array after Sorting");
		for (int i = 0; i < numOfArrays.length; i++) {

			System.out.println(numOfArrays[i]);

		}

	}

}
