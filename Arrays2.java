package testSample;
import java.util.Random;
public class Arrays2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int freq[] = new int[7];
		for(int roll=3;roll<20;roll++){
			++freq[1+rand.nextInt(6)];
		}
		
System.out.println("Face \t Frequency");
for(int face=1;face<freq.length;face++){
	System.out.println(face+"\t"+freq[face]);
}
	}

}
