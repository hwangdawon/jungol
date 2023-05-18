package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			char a = sc.next().charAt(0);
			if(a>47 && a<58) {
				System.out.println((int)a);
			}
			else if(a>64 && a<91 ) {
				System.out.println(a);
			}else if(a>96 && a<123 ) {
				System.out.println(a);
			}else {
				break;
			}
		}
	}
}
