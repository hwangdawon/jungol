package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.printf("yard? ");
		double ya = sc.nextDouble();
		double a = 91.44;
		System.out.printf("%.1fyard = %.1fcm",ya,(ya*a));
		sc.close();

	}

}
