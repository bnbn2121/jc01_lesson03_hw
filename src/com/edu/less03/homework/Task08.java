package com.edu.less03.homework;

/*
 * Дана длина ребра куба. Найти площадь грани,
 * площадь полной поверхности и объем этого куба.
 */
public class Task08 {

	public static void main(String[] args) {
		int a;
		int areaFace;
		int areaCube;
		int volumeCube;

		a = 2;

		areaFace = a * a;
		areaCube = areaFace * 6;
		volumeCube = a * a * a;

		System.out.println("площадь грани - " + areaFace);
		System.out.println("площадь куба - " + areaCube);
		System.out.println("объем куба - " + volumeCube);

	}

}
