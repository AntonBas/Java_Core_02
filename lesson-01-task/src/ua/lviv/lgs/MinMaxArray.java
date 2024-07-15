package ua.lviv.lgs;

public class MinMaxArray {
	public static void main(String[] args) {
		int[] numbers = { 5, 71, 43, 62, 7, 32, 58, 21, 89, 22 };

		int min = numbers[0];
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("Мінімальне значення: " + min);
		System.out.println("Максимальне значення: " + max);
	}

}
