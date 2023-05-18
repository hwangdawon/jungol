package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		boolean c =(a !=0) && (b!=0);
		boolean d =(a !=0) || (b!=0);
		System.out.printf("%b %b",c ,d);
	

	}

}
