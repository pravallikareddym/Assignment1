package testSample;

public class TernaryOp {

	//get cost 
	
	public static void main(String[] args) {
		double cost = 18000;
		double netAmount;
		//get cost 
		double discount = cost > 10000 ? 0.2 : cost > 5000 ? 0.1 : cost > 2000 ? 0.05 : 0;
		netAmount = discount * cost;

	}

}
