package interviewQuestion.infosys;

import java.util.Arrays;

public class ConvergeSet {
	
	//Program  asked in Infosys interview question
	//Process number n --> if n is even there return n/2 else return (n*3)+1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1, 2, 8, 10};
		Arrays.stream(arr).forEach(num -> displayConvergeSet(num));
		
	}

	private static void displayConvergeSet(int num) {
		String str = retrieveConvergeSet(num);
		System.out.println(num + " : {" + str + "}");
	}

	private static String retrieveConvergeSet(int n) {
		String res = n + ", ";
		while(n>1) {
			if(n%2==0) {
				n = n/2;
			}else {
				n = (3*n)+1;
			}
			res +=(n + ", ");
		}
		res = res.substring(0, res.length()-2);
		return res;
	}

}
