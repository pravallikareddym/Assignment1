package testSample;

public class Eleventh {

	public static void main(String[] args) {
		
		    method1();
		    System.out.println();
		    method1();
		    method3();
		    method1();
		    System.out.println();
		    method1();
		    method2();
			}
			public static void method1(){
				int i,j,k;
				for(i=3; i<=7; i=i+2)
				{
				for(j=7; j>i; j--)
				{
				System.out.print(" ");
				}
				for(k=1; k<(i*2);k++)
				{
				System.out.print("*");
				}
				System.out.println();
				}
				}
				
		public static void method2(){
		   System.out.println("    *****    ");
		   System.out.println("* | | | | | *");
		   System.out.println("* | | | | | *");
		   System.out.println("    *****    ");
		   System.out.println("    *****    ");

		    
		}
		public static void method3(){
		    System.out.println("* | | | | | *");
		    System.out.println("*************");
			
	}

}
