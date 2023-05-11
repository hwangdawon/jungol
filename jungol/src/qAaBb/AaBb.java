package qAaBb;

import java.util.Scanner;

public class AaBb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        sc.close();
//	        for(int i =0; i<a.length();i++) {
//	        	char c= a.charAt(i);
//	        	if('A'<=c && c<='Z') {
//	        		System.out.print((char)(c+32));
//	        	}else {
//	        		System.out.print((char)(c-32));
//	        	}
//	        }
	        for(int i =0; i<a.length();i++) {
	        	char c = a.charAt(i);
	        	char r= '\0';
	        	if(Character.isUpperCase(c)) {
	        		r=Character.toLowerCase(c);
	        	}else {
	        		r= Character.toUpperCase(c);
	        	}
	        	System.out.print(r);
	        }
		

	}

}
