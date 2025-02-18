import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> buffer = new ArrayList<>();
        String input = bf.readLine();
        for(int i=1;i<input.length()-1;i++){
            for(int j=i+1;j<input.length();j++){
                StringBuilder sb1 = new StringBuilder(input.substring(0,i));
                StringBuilder sb2 = new StringBuilder(input.substring(i,j));
                StringBuilder sb3 = new StringBuilder(input.substring(j));
                buffer.add(sb1.reverse().toString()+sb2.reverse().toString()+sb3.reverse().toString());
            }
        }
        Collections.sort(buffer);
        System.out.println(buffer.getFirst());
    }
}

