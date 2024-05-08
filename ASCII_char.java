import java.util.Scanner;

public class ASCII_char {

	public static void main(String[] args) {

		char ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Character: ");
		ch= sc.next().charAt(0);
		int Asnum=ch;
		System.out.println(Asnum);
	}

}
