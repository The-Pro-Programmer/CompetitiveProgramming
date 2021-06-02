package lesson3;

import java.util.Arrays;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {0,1,0,1,1}));
		System.out.println(solution(new int[] {0,1,1,1,1}));
	}
	
	public static  int solution(int[] A) {
		int total = 0;
		int n = A.length;
		for(int i=0; i<n-1; i++) {
			int a = A[i];
			int[] next = Arrays.copyOfRange(A, i, n);
			total += findPairn(a, next);
		}
		return total-1;
	}
	
	static int findPairn(int a, int[] arr) {
		int pairs = 0;
		if(a==1) {
			for(int num : arr) {
				if(num==0) {
					pairs++;
				}
			}
		}else {
			for(int num : arr) {
				if(num==1) {
					pairs++;
				}
			}
		}
		return pairs;
	}

}
