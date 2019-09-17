package test;

public class HarshadNumber {
	public boolean solution(int x) {
	      boolean answer = true;	      
			int digit1, digit2 = 0, digit3 = 0, digit4 = 0;
			
			if(x < 10)
				answer = false;
			else if(x == 100 || x == 1000 || x == 10000)
				answer = true;
			else {
				if(x <= 99) {
					digit1 = x / 10;
					digit2 += x - (digit1 * 10);
					if(x % (digit1 + digit2) == 0)
						answer = true;
					else
						answer = false;				
				}
				else if(x >= 99 && x <= 999) {
					digit1 = x / 100;
					digit2 = (x - (digit1 * 100)) / 10;
					digit3 = x - (digit1 * 100 + digit2 * 10);
					if(x % (digit1 + digit2 + digit3) == 0)
						answer = true;
					else {
						answer = false;
					}	
				}
				else if(x >= 999 && x <= 9999) {
					digit1 = x / 1000;
					digit2 = (x - (digit1 * 1000)) / 100;
					digit3 = (x -(digit1 * 1000 + digit2 * 100)) / 10 ;
					digit4 = x -(digit1 * 1000 + digit2 * 100 + digit3 * 10);
					if(x % (digit1 + digit2 + digit3 + digit4) == 0)
						answer = true;
					else {
						answer = false;
					}	
				}
			}
	      return answer;
	  }
	
	public static void main(String[] args) {	
		HarshadNumber s = new HarshadNumber();
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
		System.out.println(s.solution(11));
		System.out.println(s.solution(13));
	}

}
