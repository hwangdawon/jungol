package q613;

import java.util.Scanner;

public class NameField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name me= new Name();
		Name my = new Name();
		
		Scanner sc =new Scanner(System.in);
		
		
		me.name =sc.next();
		me.school=sc.next();
		me.grade= sc.nextInt();
		
		
		
		
		
		my.name = sc.next();
		my.school =sc.next();
		my.grade =sc.nextInt();
		sc.close();
		System.out.println("Name : "+me.name);
		System.out.println("school: "+me.school);
		System.out.println("Grade: "+me.grade);
		
		System.out.println("Name : "+my.name);
		System.out.println("school: "+my.school);
		System.out.println("Grade: "+my.grade);

		
		

	}

}
