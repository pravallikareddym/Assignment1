package testSample;

public class Arrays3 {

	public static void main(String[] args) {
		int pravali[]={2,3,4,5,6,7};
		change(pravali);
		for(int x: pravali)
			System.out.println(x);
			
	}
		
		public static void change(int x[]){
			for (int counter=0; counter < x.length;counter++)
				x[counter]+=4;
		}

	}


