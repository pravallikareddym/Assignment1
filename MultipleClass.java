package testSample;

import java.util.Scanner;

public class MultipleClass {
	//public void multipleClass4(String name){
		//System.out.println("Hello" + name);
	//}

	public static void main(String[] args) {
		Scanner pravali = new Scanner(System.in);
		//MultipleClass seshi = new MultipleClass();
		MultipleClass2 pravallika = new MultipleClass2();
		System.out.println(" Enter  name here:");
		String temp = pravali.nextLine();
		pravallika.setName(temp);
		pravallika.saying();
//seshi.multipleClass4(name);
//pravallika.multipleClass3(name);
	}

}
