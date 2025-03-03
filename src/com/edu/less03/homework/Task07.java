package com.edu.less03.homework;

/*
 * Даны два числа. Найти среднее арифметическое кубов этих чисел
 * и среднее геометрическое модулей этих чисел
 */
public class Task07 {

	public static void main(String[] args) {
		double a;
		double b;
		double arithmeticMean;
		double geometricMean;

		a = 12;
		b = 22.4;

		arithmeticMean = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		geometricMean = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.printf("Даны два числа: %.1f и %.1f%n", a, b);
		System.out.printf("Среднее арифметическое кубов этич чисел равно %.1f%n", arithmeticMean);
		System.out.printf("Среднее арифметическое кубов этич чисел равно %.1f%n", geometricMean);
	}

}
