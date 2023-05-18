package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []num= new int[10];
		for(int i =0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		int min=1000;
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min =num[i];
			}
			
		}
		System.out.print(min);

	}

}
