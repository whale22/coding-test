package codingtestexam.BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJExam_01 {
    public void buffer() throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());
        for(int i=0;i<input;i++){
            int calling = Integer.parseInt(bf.readLine());
            if(calling==0) {
                if(!stack.empty()) stack.pop();
            }
            else stack.push(calling);
        }
        int result=0;
        int size = stack.size();
        for(int i=0;i<size;i++){
            result += stack.pop();
        }
        System.out.println(result);
    }
}
