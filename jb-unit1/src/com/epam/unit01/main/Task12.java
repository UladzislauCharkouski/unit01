package com.epam.unit01.main;

public class Task12 {
	public static void main(String[] args) {
		//��������� ���������� ����� ����� ������� � ������� ������������ (�1, �1)� (x2, �2).
		int a=2; //x1 
		int b=4; //x2
		int c = 6; //y1
		int d=8; //y2
		double l; // ���������� ����� �������
		l=Math.sqrt(Math.pow((b-a), 2)+Math.pow((d-c), 2));
		System.out.println("���������� ����� ������� = " + l);
	}
}