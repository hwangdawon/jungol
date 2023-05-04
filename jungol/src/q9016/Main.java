package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("키를 입력하세요.");
		
		int num1 = sc.nextInt();
		
		
		System.out.print(" 몸무게를 입력하세요.");
		double num2 = sc.nextDouble();
		
		
		System.out.print(" 이름을 입력하세요.");
		String name =sc.next();
		
		System.out.printf(" 키 = %d\n",num1);
		System.out.printf("몸무게 = %.1f\n",num2);
		System.out.printf("이름 = %s",name);
		sc.close();
		
	
		

	}

}
