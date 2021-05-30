package lesson3;

public class FromJump {

	/*
	 * Count minimal number of jumps from position X to Y
	 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
		Count the minimal number of jumps that the small frog must perform to reach its target.
		Write a function:
			class Solution { public int solution(int X, int Y, int D); }
		that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10, 85, 30));
		System.out.println(solution(10, 50, 20));
		System.out.println(solution(10, 60, 20));
	}
	
	public static int solution(int X, int Y, int D) {
		if(D==0) {
			return Y-X;
		}
		Double difference = Double.parseDouble(""+D);
		difference = (double)(Y-X)/D;
		return (int) Math.ceil(difference);
	}

}
