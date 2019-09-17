package test;

public class BroadJump {
	public long solution(int n) {	    
		if(n <= 2)
			return n;
		else
			return (solution(n-1) + solution(n-2));
	  }

	public static void main(String[] args) {
		BroadJump bj = new BroadJump();
		System.out.println(bj.solution(4));
		System.out.println(bj.solution(3));
	}
}
