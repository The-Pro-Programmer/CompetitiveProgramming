package techgig.practice.datastructures.arrays;

import java.util.Scanner;

public class ThirdLargest {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE, l3=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num>l1) {
                l3 = l2;
                l2 = l1;
				l1 = num;
			}
		}
		
		System.out.print(l3);
		
		sc.close();

	}

}
