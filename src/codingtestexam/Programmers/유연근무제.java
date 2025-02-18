package codingtestexam.Programmers;

import java.util.*;

class 유연근무제 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int member = 0;
        for(int[] timelog : timelogs){
            for(int i=0;i<7;i++){
                int today = (startday+i)%7;
                if(today!= 6 && today!= 0) {
                    //주말일 경우 계산하지 않음
                    int time = schedules[member]; //목표 시간
                    int today_time = timelog[i]; //오늘 출근 시간
                    int limit_time = time+10; //시간에 10 더함
                    //이후 limit_time 처리
                    if(limit_time>2359) limit_time=2359; // 자정이 넘은 시간은 오늘이 될 수 없음
                    else if(limit_time%100>=60){
                        int temp = limit_time % 100; // 지금 분
                        limit_time -= 10;
                        limit_time = (limit_time/100)*100 + 100; // 시간을 올리고
                        limit_time += temp%60;
                    }

                    if(today_time>limit_time){
                        break; // 인정 시간 초과인 경우 무조건 실패.
                    }
                }
                if(i==6){
                    //끝까지 돌았는데 break가 실행되지 않았다면 성공.
                    answer++;
                }
            }
            //검사가 끝났으면 다음 멤버로
            member++;
        }
        return answer;
    }
}