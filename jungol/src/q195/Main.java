package q195;

import java.util.Scanner;

 class Infor {
	
	 String name;
	 String tel;
	 String addr;
	 
	 public void setInfor(String name,String tel,String addr) {
		
			 this.name =name;
			 this.tel=tel;
			 this.addr=addr;
		 }
		 

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		String name=sc.next();
		String tel=sc.next();
		String addr=sc.next();
		sc.close();
		 
		Infor myInfor =new Infor();
		myInfor.setInfor(name, tel, addr);
		System.out.println("name : "+myInfor.name);
		System.out.println("tel : "+myInfor.tel);
		System.out.println("addr : "+myInfor.addr);
		

	}

}
