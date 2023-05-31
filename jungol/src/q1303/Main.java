package q1303;

import java.util.Scanner;

public class Main {
//								n = inp; 
	public static void numberRect(int n, int n1) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n1; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int a = sc.nextInt();
		sc.close();

//		System.out.println(inp);

		numberRect(inp,a);
	}

}