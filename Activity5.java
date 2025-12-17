package m1_Activity5;

public class SumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumfinal = getSum();
		System.out.println("Sum = " + sumfinal);
	}
	public static int getSum(){
		int sum = 0;
		for (int x = 1; x <= 50; x++) {
			sum += x;
		}
		return sum;
	}

}
