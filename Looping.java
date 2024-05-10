
public class Looping {

	public static void main(String[] args) {
		int a=1;
		int num=5;
		
		while (a<=10) {
			System.out.println(a*num);
			a++;
		}
		do {
			System.out.println(a);
			a++;
		}while(a<=10);
		int ab=1;
		for (int i = 0; i<10 ; i++) {
			System.out.println(ab++);
		}
	}

}
