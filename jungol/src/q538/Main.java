package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		
		for(;;) {
			System.out.print("number? ");
			int b = sc.nextInt();
			
			if(b>0) {
				
				System.out.println("positive integer");
			}else if(b<0) {
				
				System.out.println("negative number");
			}else {
				sc.close();
				break;
			}
			
		}
		
		
		

	}

}
