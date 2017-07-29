package Nunmber;

import java.util.Scanner;

public class bollean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int[] score=new int[5];
boolean exist=false;
System.out.print("请输入任意数字：");
int number=input.nextInt();
System.out.print("请输入数列：");
for(int index=0;index<score.length;index++) {
	score[index]=input.nextInt();
	if(number==score[index]) {
		exist=true;
		break;
	}
}
if(exist)
	System.out.println("数列中包含此数");
else
	System.out.println("数据中不包含此数");
	}

}
