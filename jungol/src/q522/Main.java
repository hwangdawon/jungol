package q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []inp =new int[2];
		for(int i=0; i<inp.length;i++){
			inp[i] = sc.nextInt();
		}
		sc.close();
		if(inp[0] == inp[1]) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		if(inp[0] != inp[1]) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		int res1 = (inp[0] == inp[1]) ? 1 : 0;
		int res2 = (inp[0] != inp[1]) ? 1 : 0;
		System.out.println(res1);
		System.out.println(res2);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		

//			if(a==b) {
//				System.out.println("1");
//				
//			}else {
//				System.out.println("0");
//			}
//			
//			if(a!=b) {
//				System.out.println("1");
//				
//			}else {
//				System.out.println("0");
//			}
//		System.out.println((a==b)?"1":"0");
//		System.out.println((a!=b)?"1":"0");
//			sc.close();
		
		

	}

}
