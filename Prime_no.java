import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number:");
		boolean isPrime = true;
		int num = sc.nextInt();// 27

		if (num == 1) {
			System.out.println("");
		}

		for (int i = 2; i <= num / 2; ++i) {// 27/2=13 3<13

			if (num % i == 0)// 27%3 ==0
			{
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime");
		}

	}
	}


