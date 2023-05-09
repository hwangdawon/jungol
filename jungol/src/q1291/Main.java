package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =0;
		int b =0;
		
		do {
			 a = sc.nextInt();
			 b = sc.nextInt();
			 if((2<=a && a<=9) && (2<=b && b<=9)) {
				 break;
			 }
			 System.out.println("INPUT ERROR!");
				
		}while(true);
		sc.close();
//		System.out.println(a+" "+b);
		if(a<b) {
			for(int i=a; i<=b; i++) {
				for(int j =1;j<=9;j++) {
					System.out.println(i+" * "+j + " = "+(i*j));
//					System.out.printf("%2d   ", (i * j));
				}
				System.out.println();
			
			}
		}else {
			for (int i = a; i >= b; i--) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
//					System.out.printf("%2d   ", (i * j));
				}
				System.out.println();
			}
		
	   
		
		
		

	}

	}
}
