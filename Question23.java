package interviewQuestionProgram;

import java.util.Scanner;

//write a programe to find given number is prime or not 
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=scr.nextInt();
		int flag=0;
		
		if(num==2 || num==3) {
			flag=1;
		}
	
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				flag=0;
				break;
			}
			else {
				flag=1;
			}
			
		}
		if(flag==1) {
			System.out.println(num+" is a prime number ");
		}
		else {
			System.out.println(num+" is not a prime number");
		}

	}

}
