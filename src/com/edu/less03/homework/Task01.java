package com.edu.less03.homework;

/*
 * Вычислить периметр и площадь прямоугольного треугольника 
 * по длинам а и b двух катетов.
 */
public class Task01 {

	public static void main(String[] args) {
		double legA;
		double legB;
		double hypotenuse;
		double perimeter;
		double area;

		legA = 3;
		legB = 7;

		hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
		perimeter = legA + legB + hypotenuse;
		area = legA * legB / 2;

		System.out.printf("периметр треугольника равен: %.1f%n", perimeter);
		System.out.printf("площадь треугольника равна: %.1f%n", area);

	}

}
