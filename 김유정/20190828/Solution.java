class Solution {
  public String solution(int n) {
      String answer = "";
      
      for(int i=1; i<n+1; i++){
          if(i % 2 == 1)
              answer += "¼ö";
          else
              answer += "¹Ú";
            }
      return answer;
  }
    public static void main(String[] args){
        Solution sl = new Solution();
        System.out.println("n = 3: " + sl.solution(3));
        System.out.println("n = 4: " + sl.solution(4));
    }
}
