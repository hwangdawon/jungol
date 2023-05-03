package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac =new Scanner(System.in);
	    double a = ac.nextDouble();
		
		if( 50.80>=a) {
			System.out.println("Flyweight");
		}else if(61.23>=a && 50.80< a) {
			System.out.println("Lightweight");
		}else if(72.57>=a && 61.23< a) {
			System.out.println("Middleweight");
		}else if(88.45>=a && 72.57< a) {
			System.out.println("Cruiserweight");
		}else {
			System.out.println("Heavyweight");
		}ac.close();

	}

}
