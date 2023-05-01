package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab = new Scanner(System.in);
		int num = ab.nextInt();
		ab.close();
		
		//for
		int sum =0;
		for(int i=1;i<=num; i++) {
			sum= sum+i; //sum +=i;
			
		}
		System.out.println(sum);
		
		//while
		
		int sum2 =0;
		int i2= 0;
		while(i2 <= num) {
			sum2 +=i2++;
		
			}
		System.out.println(sum2);
		
		//do~while
		int  sum3=0;
		int i3 =0;
		do { 
			sum3 += i3++;
		}while(i3<=num);
		System.out.println(sum3);

	}

}
