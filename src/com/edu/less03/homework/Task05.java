package com.edu.less03.homework;

/*
 * Написать программу, которая выводит на экран первые четыре степени числа π.
 */
public class Task05 {

	public static void main(String[] args) {
		double pi = Math.PI;

		for (int i = 1; i <= 4; i++) {
			System.out.printf("Число ПИ в степени " + i + " равно %.2f%n", Math.pow(pi, i));
		}
	}

}
