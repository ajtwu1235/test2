package Level1;

public class PY_Count {
    public static boolean solution(String s) {
        boolean answer = true;
        int p_cnt =0;
        int y_cnt=0;
        String[] a = s.toLowerCase().split("");
        for(int i=0;i<a.length;i++){
            if(a[i].equals("p")){
                p_cnt++;
            }
            if(a[i].equals("y")){
                y_cnt++;
            }
        }
      if(p_cnt!=y_cnt){
          answer = false;
      }     
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
