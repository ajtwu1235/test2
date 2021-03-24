package Level1;

public class New_ID_Recommend {
    public static String solution(String new_id) {
        String answer = "";
        //1단계
        new_id=new_id.toLowerCase();
        //2단계
        new_id=new_id.replaceAll("[^0-9a-z_.-]",""); //조건을 제외한목록
        //3단계
        new_id=new_id.replaceAll("[.]+",".");//연속된 마침표 .로 치환
        //4단계
        if(new_id.startsWith(".")){
            new_id=new_id.substring(1);
        }
        if(new_id.endsWith(".")){
            new_id=new_id.substring(0,new_id.length()-1);
        }
        //5단계
        if(new_id.equals("")){
            new_id="a";
        }
        //6단계
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
        }
        if(new_id.endsWith(".")){
            new_id=new_id.substring(0,new_id.length()-1);
        }
        //7단계
        while(new_id.length()<3){
            new_id+=new_id.charAt(new_id.length()-1);
        }
        answer=new_id;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
    }
}
