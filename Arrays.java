package testSample;

public class Arrays {

	public static void main(String[] args) {
		
		int paravali [] = {13,2, 3, 5, 7, 8,9,2,3, 4,8};
		int sum = 1;
		
		
		for(int i =0;i< paravali.length;i+=3){
		sum+= paravali[i];
		// TODO Auto-generated method stub

	}
		System.out.println("the sum of numbers is :" +sum );

}
}
