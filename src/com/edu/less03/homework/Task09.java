package com.edu.less03.homework;

/*
 * Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту,
 * радиусы вписанной и описанной окружностей.
 */
public class Task09 {

	public static void main(String[] args) {
		int a;
		double area;
		double h;			// высота
		double rIn;			// радиус вписанной окружности
		double rOut;		// радиус описанной окружности

		a = 5;

		h = a * Math.sqrt(3) / 2;
		area = h * a / 2;
		rIn = h / 3;
		rOut = h / 3 * 2;

		System.out.printf("Высота = %.1f%n", h);
		System.out.printf("Площадь = %.1f%n", area);
		System.out.printf("Радиус вписанной окружности = %.1f%n", rIn);
		System.out.printf("Радиус описанной окружности = %.1f%n", rOut);

	}

}
