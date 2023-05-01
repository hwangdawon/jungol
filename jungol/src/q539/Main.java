package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab =new Scanner(System.in);
		int sum =0;	
		int cut=0;
		while(true) {
			int num = ab.nextInt();
			sum+=num;
			cut++;
			if(num>=100) {
				break;
			} 
			}
		ab. close();
		
		System.out.println(sum);
//		System.out.println((double)sum/cut);
		System.out.printf("%.1f\n",(double)sum/cut);
		
		
		

	}

}
