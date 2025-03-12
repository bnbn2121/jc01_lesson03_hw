package com.edu.less03.homework;

/*
 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2),(х3, у3). 
 * Найти его периметр и площадь.
 */
public class Task03 {

	public static void main(String[] args) {
		double x1, y1;
		double x2, y2;
		double x3, y3;
		double side12;
		double side23;
		double side31;
		double perimeter;
		double semiperimeter;
		double area;
		
		x1 = 8;		y1 = 21.9;
		x2 = 1.5;	y2 = -14;
		x3 = 7;		y3 = 0;

		side12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		side23 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		side31 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		perimeter = side12 + side23 + side31;
		
		semiperimeter = perimeter / 2;
		area = Math.sqrt(semiperimeter * (semiperimeter - side12) * 
				(semiperimeter - side23) * (semiperimeter - side31));

		System.out.printf("Периметр: %.1f%n", perimeter);
		System.out.printf("Площадь: %.1f%n", area);

	}

}
