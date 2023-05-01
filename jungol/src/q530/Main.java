package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ag=new Scanner(System.in);
		
		int age =ag.nextInt();
		ag.close();
		
		if(age >= 20) {
			System.out.println("adult");
		}else  {
			System.out.print((20-age)+" years later");
		}
		
		

	}

}
