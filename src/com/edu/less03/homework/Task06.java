package com.edu.less03.homework;

/*
 * Найти произведение цифр заданного четырехзначного числа.
 */
public class Task06 {

	public static void main(String[] args) {
		int number = 1976;
		int multiplication = 1;
		int tempNumber = number;

		if (number<1000 || number>9999) {
			System.out.println("Число не четырехзначное");
			return;
		}
		while (tempNumber > 0) {
			multiplication *= tempNumber % 10;
			tempNumber /= 10;
		}
		System.out.println("Произведение цифр числа " + number + " равно " + multiplication);
	}

}
