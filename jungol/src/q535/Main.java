package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double scores = sc.nextDouble();
		sc.close();
		switch((int)scores) {
		
		case (int) 4.0:
			System.out.println("scholarship");
		  break;
		case (int)3.0:
			System.out.println("next semester");
		   break;
		case (int)2.0:
			System.out.println("seasonal semester");
		    break;
		default:
			System.out.println("retake");
			break;
		}

	}

}
