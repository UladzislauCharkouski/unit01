package com.epam.unit01.main;

public class TrainingTask04 {
		public static void main(String[] args) {
	int a=3; //����� 1
	int b=4; //����� 2
	double c=0; //�����������
	int s=0; //�������
	double d=0; //����� 1 � ��������
	double g=0; //����� 2 � ��������
	double z=0; //������������ �������
	d=Math.pow(a, 2);
	g=Math.pow(b, 2);
	z=d*g;
	c=Math.sqrt(z); // ������ �����������, ������ ���������� �� ������������ ��������� �������
	s = a*b/2; //������ �������
	System.out.println("�����������= " + c + "; �������= " + s);
		}
}