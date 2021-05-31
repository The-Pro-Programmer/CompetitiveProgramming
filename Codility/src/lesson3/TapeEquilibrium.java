package lesson3;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {3,1,2,4,3}));
	}
	
	public static int solution(int[] A) {
		if(A==null || A.length==0) {
			return 0;
		}
		Integer minDiff = Integer.MAX_VALUE;
		Integer n = A.length;
		int P = 1;
		int[] left = Arrays.copyOfRange(A, 0, P);
		int[] right = Arrays.copyOfRange(A, P, n);
		int leftSum = Arrays.stream(left).sum();
		int rightSumm = Arrays.stream(right).sum();
		for(; P<n; P++) {
			if(Math.abs(leftSum-rightSumm)<minDiff) {
				minDiff = Math.abs(leftSum-rightSumm);
			}
			int pivot = A[P];
			leftSum += pivot;
			rightSumm -= pivot;
		}		
		return minDiff;
	}

}
