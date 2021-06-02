package lesson3;

import java.util.Arrays;


//Missing number from Array
public class FindMissingNumeber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,5};
		System.out.println(solution(arr));
	}
	
	public static Long solution(int[] A) {
        if(A==null || A.length==0){
            return 1l;
        }
        Long n = (long) A.length;
        Long sN = (n*(n+1))/2;
        Long sArr = Long.parseLong(""+Arrays.stream(A).sum());
        Long missingNum = n - (sArr-sN) + 1;
        return missingNum;
    }

}
