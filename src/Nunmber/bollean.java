package Nunmber;

import java.util.Scanner;

public class bollean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int[] score=new int[5];
boolean exist=false;
System.out.print("�������������֣�");
int number=input.nextInt();
System.out.print("���������У�");
for(int index=0;index<score.length;index++) {
	score[index]=input.nextInt();
	if(number==score[index]) {
		exist=true;
		break;
	}
}
if(exist)
	System.out.println("�����а�������");
else
	System.out.println("�����в���������");
	}

}
