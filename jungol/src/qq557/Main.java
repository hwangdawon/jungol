package qq557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char [] num = new char [10];
		
		for(char a=0; a<num.length; a++) {
			num[a]=sc.next().charAt(0);

			if(a==0) {
				System.out.printf("%c ",num[a]);
				
			}else if(a==3) {
				System.out.printf("%c ",num[a]);
			}else if(a==6) {
				System.out.printf("%c ",num[a]);
			}
		}
		sc.close();
//		System.out.print(num[0]+" ");
//		System.out.print(num[3]+" ");
//		System.out.print(num[6]+" ");
//		

	}

}
