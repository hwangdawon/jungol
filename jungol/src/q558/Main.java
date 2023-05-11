package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int []num = new int[100];
		

		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			
			if(num[i]==0) {
			for(int j=i-1;j>=0;j--) {
				System.out.print(num[j]+" ");
				}
			  break;
			

			
			}

			
			
		}
		
		
		sc.close();

	}

}
