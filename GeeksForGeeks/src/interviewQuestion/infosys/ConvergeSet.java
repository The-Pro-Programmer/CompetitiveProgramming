package interviewQuestion.infosys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvergeSet {
	
	//Program  asked in Infosys interview question
	//Process number n --> if n is even there return n/2 else return (n*3)+1
	
	static Map<Integer, List<Integer>> directory = new HashMap<>();
	
	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 8, 10};
		Arrays.stream(arr).forEach(num -> displayConvergeSet2(num));
	}
	
	static void displayConvergeSet2(int num) {
		Set<Integer> convergerSet = retrieveConvergeSet2(num);
		System.out.println(num);
		convergerSet.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();
	}

	static Set<Integer> retrieveConvergeSet2(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	static void displayConvergeSet(int num) {
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
