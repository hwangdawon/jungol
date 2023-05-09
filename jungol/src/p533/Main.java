package p533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char a =sc.next().charAt(0);
		int b =sc.nextInt();

		

		if(a== 'M' && b>=18) {
			
			System.out.println("MAN");
			
		}else if(a== 'M' && b<18) {
			System.out.println("BOY");
		}else if(a=='F'&& b>=18) {
			System.out.println("WOMAN");
		}else {
			System.out.println("GIRL");
		}
		sc.close();



	}

}
