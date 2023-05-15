package q613;

import java.util.Scanner;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
//		Name me = new Name();

//		Name my = new Name();
		String name =sc.next();
		String school =sc.next();
		int grade =sc.nextInt();
		
		
		
		Name me =new Name(name, school, grade);
//		me.
//		me.school=sc.next();
//		me.grade= sc.nextInt();
//		Name my = new Name();
		Name my =new Name(name, school, grade);
//		my.name = sc.next();
//		my.school =sc.next();
//		my.grade =sc.nextInt();
		sc.close();
		System.out.println("Name : "+me.name);
		System.out.println("School : "+me.school);
		System.out.println("Grade : "+me.grade);
		
		System.out.println("Name : "+my.name);
		System.out.println("school: "+my.school);
		System.out.println("Grade: "+my.grade);

		
		

	}

}
