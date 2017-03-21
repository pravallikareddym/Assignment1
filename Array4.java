package testSample;

public class Array4 {

	

	public static void main(String[] args) {
	int firstarray[][]={{1,2,3,4},{7,8,9,10}};	
	int secondarray[][]={{1,2,3,4},{7,8,9,10},{1,2,3,4}};
	System.out.println("first array");

	display(firstarray);
	System.out.println("second array");
	display(secondarray);
	}
	public static void display(int x[][]){
		for(int row=0;row<x.length; row++){
			for(int column=0; column<x[row].length;column++){
				System.out.println(x[row][column]+"\t");
		}

	}
System.out.println();
	}
}
