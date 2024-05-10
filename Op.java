import java.util.Scanner;

public class Op {

	public static void main(String[] args) {
		
		int a=20;
		int b=50;
		System.out.println(a<b || b<a);
		System.out.println(!(a<b));
		
		System.out.println(a+=400);
		
		System.out.println(a);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.close();
		String out =(age>0 && age<18)?"NOT READY":(age>=18 && age<100)?"READY TO VOTE..":"INVALID AGE";
		System.out.println(out);
		
	}

}
