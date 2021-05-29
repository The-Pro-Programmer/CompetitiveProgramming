package lessons;


//Rotate an array to the right by a given number of steps.
//Find value that occurs in odd number of elements.
public class ArrayRotation {

	public static void main(String[] args) {
		int A[] = {3, 8, 9, 7, 6};
		rotate(A, 3);
	}

	private static int[] rotate(int[] a, int k) {
		if(a==null || a.length==0) {
			return a;
		}
		int n = a.length;
		k = k%n;
        int b[] = new int[n];
		if(k!=0) {
			for(int i=0; i<n; i++) {
				System.out.print((i+k)%n + " - " + i + ", ");
				b[(i+k)%n] = a[i];
			}
		}else{
            return a;
        }
        return b;
	}
	
}
