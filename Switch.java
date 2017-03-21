package testSample;

public class Switch {

	public static void main(String[] args) {
		int age;
		age= 5;
		switch(age){
		case 1:
			System.out.println("not equal");
			break;
		case 3:
			System.out.println("less");
			break;
		case 5:
			System.out.println(" equal");
			break;
		case 6:
			System.out.println("greater");
			break;
			default:
			
				System.out.println("nothing");
				break;
		}

	}

}
