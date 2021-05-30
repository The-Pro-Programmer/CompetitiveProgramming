package lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int oddOccurrencesInArray(int[] A) {
		Arrays.sort(A);
		int n = A.length;
		int res = A[n-1];
		for(int i=0; i<n-1; i++) {
			if(A[i]==A[i+1]) {
				i++;
			}else {
				return A[i];
			}
			
		}
		return res;
	}

}
