package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int  b=sc.nextInt();
		int c =sc.nextInt();
		double []a = {85.6,79.5, 83.1 ,80.0, 78.2, 75.0};
		

		System.out.println(a[b-1]+a[c-1]);
		
		sc.close();


	}

}
