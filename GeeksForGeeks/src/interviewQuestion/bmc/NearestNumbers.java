package interviewQuestion.bmc;

import java.util.Arrays;

public class NearestNumbers {

	static int distClosestNumbers(int[] numbers) {

        Arrays.sort(numbers);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length-1; i++){
            int diff = Math.abs(numbers[i] - numbers[i+1]);
            if(diff<min){
                min = diff;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); 
    }
	
}
