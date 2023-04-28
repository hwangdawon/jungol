package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
//		System.out.println(w);
//		System.out.println(h);

		int z = h + 100 - w;
		System.out.println(z);
		
		if(z>0) {
			System.out.println("Obesity");
		}

	}

}
