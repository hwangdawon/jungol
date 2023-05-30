package q575;

import java.util.Scanner;

public class Main {
	
	public static int x(int p1, int p2) {
		int ret =1;
		for(int i=0;i<p2;i++) {
			ret*=p1;
		}
		
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		int r=x(num1,num2);
		System.out.println(r);
		
		

	}

}
