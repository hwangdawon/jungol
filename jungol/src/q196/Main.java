package q196;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String name=sc.next();
		String tel=sc.next();
		String addr=sc.next();
		Infor myInfor =new Infor();
		
		name=sc.next();
	    tel=sc.next();
		addr=sc.next();
		Infor myInfor2 =new Infor();
		
		name=sc.next();
	    tel=sc.next();
		addr=sc.next();
		Infor myInfor3 =new Infor();
		sc.close();
		myInfor.SetInfor(name, tel, addr);
		myInfor.Setname(name);
		
		

	}

}
