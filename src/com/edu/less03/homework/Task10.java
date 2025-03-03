package com.edu.less03.homework;

/*
 * Известна длина окружности. Найти площадь
 * круга, ограниченного этой окружностью.
 */
public class Task10 {

	public static void main(String[] args) {
		double circumference = 6.5;
		double pi = Math.PI;
		double radius;
		double area;

		radius = circumference / 2 / pi;
		area = pi * Math.pow(radius, 2);

		System.out.printf("Площадь круга = %.1f%n", area);

	}

}
