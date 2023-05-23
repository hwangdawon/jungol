package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []a = new int[10];
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		
		
		
		
		// 1. 100미만의 수만 출력;
		int max= 0;
      for(int i=0;i<a.length;i++) {
			
				if( a[i]<100) {
//					System.out.print(a[i]+" ");
					if(a[i]>max) {
						max=a[i];
					}
				 }
				
	
					
			 
		}
      if(max == 0) {
    	  max =100;
      }
         System.out.print(max+" ");
         
         //2. 100이상의 수
          int min =10000;
		for(int i=0;i<a.length;i++) {
		
			if(a[i]>=100 ) {
//				System.out.print(a[i]+" ");
				if(a[i]<min) {
					min = a[i];
				}
				
			}
			 
		}
		if(min==10000 ) {
			min =100;
		}
		System.out.println(min);
	

	}

}
