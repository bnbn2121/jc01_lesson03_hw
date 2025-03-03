package com.edu.less03.homework;

/*
 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2),(х3, у3). 
 * Найти его периметр и площадь.
 */
public class Task03 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double perimeter;
		double area;
		double distance12; 		// расстояние между точками №1 и №2
		double distance23; 		// расстояние между точками №2 и №3
		double distance31; 		// расстояние между точками №3 и №1

		x1 = 8;
		y1 = 21.9;
		x2 = 1.5;
		y2 = -14;
		x3 = 7;
		y3 = 0;

		distance12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		distance23 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		distance31 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		perimeter = distance12 + distance23 + distance31;

		area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)); // площадь по какой-то формуле из интернета

		System.out.printf("Периметр: %.1f%n", perimeter);
		System.out.printf("Площадь: %.1f%n", area);

	}

}
