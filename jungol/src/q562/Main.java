package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int [] num = new int[10];
		int agv =0;
		int sum=0;
	
		for(int i=0; i<num.length;i++) {
			num[i]= sc.nextInt();
			
			//홀수
			if(i%2==0) {
			
				agv +=num[i];
//				for(int j=0;j<num.length;j++) {
//					 c+=num[j] ;
//					
//					
//				}
//				
			}
			 if(i%2!=0)
			 {
				sum +=num[i];
				
			}
			 

		}
		System.out.printf("sum : "+sum+" \n");
		System.out.printf("avg : %.1f\n",(agv/(double)5));
		
	}

}
