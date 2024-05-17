
public class Switchcase {

	public static void main(String[] args) {
		
		int key=3;
		switch (key) {
		case 1: {
			System.out.println(key+"");
			break;
		}
		case 2: {
			System.out.println(key+"");
			break;
		}case 3: {
			System.out.println(key+"Match");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
