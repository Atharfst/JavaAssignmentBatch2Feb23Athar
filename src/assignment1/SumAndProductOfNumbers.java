package assignment1;

public class SumAndProductOfNumbers {

	public static void main(String[] args) {

		int arrValue1[] = { 5, 3, 6, 8, 4, 1, 2, 9 };
		SumProductOfNo(arrValue1);

		int arrValue2[] = { 12, 1234, 45, 67, 1 };
		SumProductOfNo(arrValue2);
	}

	public static void SumProductOfNo(int arr[]) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];
		}

		int Sum = min + max;
		int Product = min * max;

		System.out.println("Sum is " + Sum);
		System.out.println("Product is " + Product);
		System.out.println("===========================");
	}

}
