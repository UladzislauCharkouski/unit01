package com.epam.unit01.main;

public class Task10 {
	public static void main(String[] args) {
		// Вычислить значение выражения по формуле (все переменные принимаютдействительные значения):𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦/𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦 ∗ 𝑡𝑔 𝑥𝑦
		int x=4, y=8;
		double z;
		z=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
		System.out.println("Result = " + z);
	}
}
