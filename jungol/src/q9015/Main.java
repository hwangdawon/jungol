package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오.");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.printf(" %d + %d = %d\n",num,num2,(num+num2));
		System.out.printf("%d * %d = %d",num,num2,(num*num2));
		sc.close();
		

	}

}
