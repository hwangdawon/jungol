package q573;

import java.util.Scanner;

public class Main {
//								n = inp; 
	public static void numberRect(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(inp);

		numberRect(inp);
	}

}