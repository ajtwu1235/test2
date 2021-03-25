package Level1;
import java.util.ArrayList;
import java.util.Arrays;
public class Practice_Test {
    public static int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        
        // List<Integer> -> int[] 변환
        int[] result =new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] answer1 ={1,2,3,4,5};
        int[] answer2 ={1,3,2,4,2};
        int[] answer3 ={1,5,3,2,4,1,5,2,4,3};
        System.out.println(Arrays.toString(solution(answer1)));
        System.out.println(Arrays.toString(solution(answer2)));
        System.out.println(Arrays.toString(solution(answer3)));
    }
}
