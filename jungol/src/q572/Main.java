package q572;

import java.util.Scanner;

class Mainn {
	
	double num (double a) {
		double add = a*a*3.14;
		System.out.printf("%.2f ",add);
		return add;
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 int a=sc.nextInt();
		 sc.close();
		 
		Mainn ba =new Mainn();
		  ba.num(a); 
		
		

	}

}
