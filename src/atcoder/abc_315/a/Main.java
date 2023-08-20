package atcoder.abc_315.a;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static char[] input;
    static String answer;
    
    static void input() throws IOException {
        input = br.readLine().toCharArray();
    }
    
    static void process() throws IOException {
        answer = "";
        for (char c : input) {
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                continue;
            }
            answer += c;
        }
    }
    
    static void output() throws IOException {
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}