package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		int ab = num.nextInt();
		int cd = num.nextInt();
		
		
		System.out.println(ab+ " * "+cd +" = "+(ab*cd));
		System.out.println(ab+" / "+cd+" = "+(ab/cd));
		num.close();
	}

}
