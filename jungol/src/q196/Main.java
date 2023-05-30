package q196;

import java.util.Scanner;

class Infor {
	
	String name;
	String tel;
	String addr;
	
	public void SetInfor(String name, String tel,String addr) {
		this.name=name;
		this.tel=tel;
		this.addr=addr;
	}
	public void Setname(String name) {
		for(int i=0;i<name.length();i++) {
			 i=name.charAt(0);
			
		}
	}
	public void print() {
		System.out.println();
	}
 
}



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
