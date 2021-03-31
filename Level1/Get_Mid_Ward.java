package Level1;
public class Get_Mid_Ward {
    public static String solution(String s) {
        String answer = "";
        if(s.length()%2==1){
            answer=s.substring(s.length()/2,s.length()/2+1);
        }
        else{
            answer=s.substring(s.length()/2-1,s.length()/2+1);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
}