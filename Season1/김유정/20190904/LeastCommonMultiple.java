public class LeastCommonMultiple{
	public int solution(int[] arr) {
		int lcm = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			lcm = LCM(lcm, arr[i]); 
		}
		return lcm;
	}
	
	public int GCD(int a, int b) {
		int temp;
		while(b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public int LCM(int a, int b) {
			return a * b / GCD(a, b);
	}	

public static void main(String[] args) {
	LeastCommonMultiple L = new LeastCommonMultiple();
	
		int[] arr1 = {2,6,8,14};
		int[] arr2 = {1,2,3};
		
	    System.out.println(L.solution(arr1));
	    System.out.println(L.solution(arr2));
	}
}
