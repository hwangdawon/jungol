package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []num=new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		int max=0;
		for(int j=0;j<num.length;j++) {
			if(num[j]>max) {
				max=num[j];
			}
			System.out.print(max+" ");
			
		}

	}

}
