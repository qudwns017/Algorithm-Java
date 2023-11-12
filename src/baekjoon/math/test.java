package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;
        while((S=br.readLine()) != null) {
            int n = Integer.parseInt(S);
            int cnt = 1;
            int base = 1;
            while ((base=base%n) != 0) {
                cnt++;
                base = (base * 10) + 1;
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) throws IOException {
        new test().solution();
    }
}

// 1, 11, 111, 1111... 순으로 증가하면서
// n으로 나누떨어지는지 검사해야함
// false로 나오면 cnt를 1 더해줘서 자릿수 증가
// true면 cnt 반환
