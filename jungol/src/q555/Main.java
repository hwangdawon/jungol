package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        char[] name= new char[10];
		for(char i= 0; i<name.length; i++) {
			name[i] =sc.next().charAt(0);
			System.out.printf("%c",name[i]);
		}
		sc.close();
//		
	}

}
