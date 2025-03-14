package codingtestexam.Programmers;

import java.util.Arrays;
import java.util.Collections;

public class 구명보트 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            Integer[] arr = Arrays.stream(people).boxed().toArray(Integer[]::new);

            Arrays.sort(arr, Collections.reverseOrder());
            int start = people.length%2;
            if(start==1) answer++;
            int end = people.length-1;
            while(end>=start){
                if(start==end){
                    answer++;
                    break;
                }else {
                    if((arr[start]+arr[end])<=limit){
                        end--;
                        start++;
                    }else{
                        start++;
                    }
                    answer++;
                }
            }

            return answer;
        }
    }
}
