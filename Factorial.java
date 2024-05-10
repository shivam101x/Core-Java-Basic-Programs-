import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		sc.close();
		int i=1,fact=1;
		System.out.println("Factorial of: ");
		while (i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.print(num+" is: "+fact+" ");
	}

}
