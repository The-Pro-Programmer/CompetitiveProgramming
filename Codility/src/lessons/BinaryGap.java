package lessons;

/*
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 */

public class BinaryGap {

	public static void main(String[] args) {
		int arr[] = {1, 0, 2, 1041, 15, 32, 51712};
		for(int N : arr) {
			int binaryGap = findBinaryGap2(N);
			System.out.println(N + " - Binary Gap: " + binaryGap);
		}
	}

	private static int findBinaryGap2(int N) {
		String binary = Integer.toBinaryString(N);
		int index = 0;
		int max = 0;
		while(index<binary.length()) {
			if(binary.charAt(index)=='1') {
				int next1 = binary.indexOf('1', (index+1));
				if(next1>0) {
					int diff = next1 - index;
					if(diff>1){
						String subString = binary.substring(index+1, next1);
						if(subString.length()>max) {
							max = subString.length();
						}
					}
				}
			}
			index++;
		}
		return max;
	}

	private static int findBinaryGap(int N) {
		if(isPowerOf2(N)) {
			return 0;
		}
		String binary = Integer.toBinaryString(N);
		String[] zeros = binary.split("1");
		System.out.print(binary + " -- ");
		int maxLen = 0;
		if(zeros!=null) {
			for(String group : zeros) {
				if(group.length()>maxLen) {
					maxLen = group.length();
				}
			}
		}
		return maxLen;
	}

	private static boolean isPowerOf2(int n) {
		return (int)(Math.ceil((Math.log(n) / Math.log(2))))   == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}

}
