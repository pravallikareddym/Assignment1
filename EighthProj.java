package testSample;

public class EighthProj {

	public static void main(String[] args) {
		 System.out.println("Pyramid pattern of star in Java : ");
		 drawPyramidPattern(); 
		 System.out.println("Pyramid of numbers in Java : "); 
		 drawPyramidOfNumbers(); 
		 } 
	
		
	
	public static void drawPyramidPattern() { 
		 for (int i = 0; i < 5; i++) {
			 for (int j = 0; j < 5 - i; j++) { 
				 System.out.print("\n "); 
				 } 
			 for (int k = 0; k <= i; k++) { 
				 System.out.print(" * ");
				 } 
			 
		 }
	}

		 public static void drawPyramidOfNumbers() { 
			 for (int i = 0; i < 5; i++) { 
				 for (int j = 0; j < 5 - i; j++) { 
					 System.out.print(" "); } 
				 for (int k = 0; k <= i; k++) { 
					 System.out.print(k + " ");
					 }
				 System.out.println();
				 }
		 }
	}

		 


