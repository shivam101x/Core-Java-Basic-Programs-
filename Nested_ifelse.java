import java.util.Scanner;

public class Nested_ifelse {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Username");
		String username=sc.next();
		
		System.out.println("Enter Password");
		String password=sc.next();
		sc.close();
		if(username.equals("abc")) {
			if(password.equals("012345")) {
				System.out.println("Sucess");
			}else {
				System.out.println("Invalid Password");
			}
			
			}else {
				System.out.println("USername Invalid");
		}
	}
}
