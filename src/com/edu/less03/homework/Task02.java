package com.edu.less03.homework;

/*
 * Вычислить расстояние между двумя точками
 * с данными координатами (х1, у1)и (x2, у2).
 */
public class Task02 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double distance12;

		x1 = 4;
		y1 = -8;
		x2 = -5.7;
		y2 = 31;

		distance12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		System.out.printf("Расстояние между точками: %.2f", distance12);

	}

}
