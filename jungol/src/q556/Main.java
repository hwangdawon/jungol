package q556;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num= {1,2,3,4,5,6,7,8,9,10};
//		
//		for(int i= 0; i<10;i++) {
//			System.out.printf("%d ",num[i]);
//			
//		}
		int num []=new int[10];
		
//		for(int i = 0 ; i<num.length; i++ ) {
//			num[i] = i+1;
//			System.out.printf("%d ",num[i]);
//			
//			
//		}
		for(int i = 0 ; i<num.length; i++ ) {
			num[i] = i+1;
			System.out.print(num[i]);
			if(i<num.length-1) {
			System.out.print("?");
			}
			
		}

	}

}
