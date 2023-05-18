package q614;

import java.util.Scanner;

 class Student {
	String name ;
	int grade;
	
	Student(String n,int g){
	  name = n;
	  grade = g;
	  
  }
	

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		
		
		String name=sc.next();
		int grade =sc.nextInt();
		sc.close();
		
		Student c1 = new Student("Jejuelementary",6);
		Student c2 =new Student(name,grade);
		System.out.println(c1.grade+" grade in "+c1.name+" School");
		
	   	
		System.out.println(c2.grade+" grade in "+ c2.name+" School");
		
		

	}

}
