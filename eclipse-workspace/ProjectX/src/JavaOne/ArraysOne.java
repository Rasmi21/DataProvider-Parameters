package JavaOne;

public class ArraysOne {

	public static void main(String[] args) {
		int[] one = new int[10];
		for (int i = 0; i < 10; i++) {
			one[i] = i + 1;
		}
		
		System.out.println(toString(one));;
		System.out.println(toString(rev(one)));
	
		 

	}

	public static int[] rev(int[] given) {
		int[] output = new int[given.length];
		int j = 0;
		for (int i = given.length - 1; i >= 0; i--) {
			output[j] = given[i];
			j++;
		}
return output;
	}

	public static String toString(int [] given) {
		String out = "[";
		for(int i =0;i<given.length;i++) {
			out = out +given[i];
			
		}
		out=out+"]";
		return out;
	}
}
