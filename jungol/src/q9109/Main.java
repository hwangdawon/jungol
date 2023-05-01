package q9109;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
////		String ch= ab.next();
//		String ch= ab.nextLine();
//		ab.close();
//		System.out.println(ch+"");
		
		String str="";
		while(true) {
//			char c =ab.next().charAt(0);
//			
			String inp =ab.next();
			char c = inp.charAt(0);
			
			if(('A'<= c && c <='Z')||('a'<= c && c <='z')) {
				str += c;
			}else {
				break;
			}
		}
          System.out.println(str);
	}

}
