package q571;

import java.util.Scanner;

class Mainn {
	
	void name() {
		System.out.println("~!@#$^&*()_+|");
	}

}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 int a =sc.nextInt();
		 sc.close();
		 
		 Mainn add= new Mainn();
		for(int i=0;i<a;i++) {
			 add.name();
		}

	}

}
