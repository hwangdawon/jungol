package q616;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		sc.close();
		Semo a1= new Semo(x1,y1,x2,y2,x3,y3);
		double dx =a1.getCoGX();
		double dy =a1.getCoGY();
		System.out.printf("(%.1f, %.1f)\n",dx,dy);
		
		
//		double dx =(x1+x2+x3)/(double)3;
//		double dy =(y1+y2+y3)/(double)3;

		
	
	}

}
