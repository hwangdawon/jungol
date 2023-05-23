package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
//		int kor= sc.nextInt();
//		int eng=sc.nextInt();
//		int mat=sc.nextInt();
//		int com=sc.nextInt();
//		int sum =kor+eng+mat+com;
//		double avg=sum/4;
//		System.out.printf("sum %d\n",sum);
//		System.out.printf("avg %.0f \n",avg);
		
		
//		int sum=0;
//		for(int i=0;i<4;i++) {
//			int inp=sc.nextInt();
//			sum +=inp;
//		}
//		sc.close();
//		System.out.println("sum "+sum);
//		System.out.println("avg "+sum/4);
		
		int score[]= new int[4];
		for(int i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
		int sum =0;
		for(int i=0;i<score.length;i++) {
			
		}

	}

}
