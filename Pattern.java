public class Pattern {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			int a=1;
			for(int j=10;j>i;j--) {
				System.out.print(a++);
			}
			System.out.println();
		}

	}

}