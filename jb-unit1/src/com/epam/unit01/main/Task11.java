package com.epam.unit01.main;

public class Task11 {
	public static void main(String[] args) {
		//��������� �������� � ������� �������������� ������������ �� ������ � � b ���� �������.
		double a=5, b=10; // ������
		double p; // ��������
		double s; // �������
		p=a+b+Math.sqrt(a*a+b*b);
		s=0.5*a*b;
		System.out.println("�������� = " + p + "; �������=" +s);
	}
}