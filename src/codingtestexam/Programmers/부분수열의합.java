package codingtestexam.Programmers;

import java.util.ArrayList;
import java.util.List;

public class 부분수열의합 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,0};
        int left=0, right=0;
        int sum=0;
        List<int[]> list = new ArrayList<>();
        int[] prifix_sum = new int[sequence.length + 1];

        for(int i=0;i<sequence.length;i++){
            prifix_sum[i+1] = prifix_sum[i]+sequence[i];
            //부분합 계산
        }

        while(right<sequence.length) {
            sum=prifix_sum[right+1]-prifix_sum[left];
            if(sum<k) right++;
            else if(sum>k) left++;
            else{
                list.add(new int[]{left, right});
                left++;
            }
        }

        int min = list.get(0)[1] - list.get(0)[0];
        answer = new int[]{list.get(0)[0], list.get(0)[1]};

        for(int i=1;i<list.size();i++){
            if(min>calc_length(list.get(i))) {
                min = calc_length(list.get(i));
                answer = new int[]{list.get(i)[0], list.get(i)[1]};
            }
        }

        return answer;
    }

    public int calc_length(int[] array){
        return Math.max(array[0], array[1]) - Math.min(array[0], array[1]);
    }
}
