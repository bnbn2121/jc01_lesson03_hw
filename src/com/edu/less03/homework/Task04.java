package com.edu.less03.homework;

/*
 * Вычислить длину окружности и площадь круга
 * одного и того же заданного радиуса R.
 */
public class Task04 {

	public static void main(String[] args) {
		double radius;
		double circumference;
		double area;
		double pi = Math.PI;

		radius = 5.9;

		circumference = 2 * pi * radius;
		area = pi * radius * radius;

		System.out.printf("Длина окружности: %.1f%n", circumference);
		System.out.printf("Площадь: %.1f%n", area);
	}

}
